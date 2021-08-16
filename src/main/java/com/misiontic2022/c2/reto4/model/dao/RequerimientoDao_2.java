package com.misiontic2022.c2.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.misiontic2022.c2.reto4.model.vo.Requerimiento_2;
import com.misiontic2022.c2.reto4.util.JDBCUtilities;

public class RequerimientoDao_2 {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException{
        
        ArrayList<Requerimiento_2> respuesta  = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT p.Fecha_Inicio, p.Ciudad, p.Constructora, l.Nombre ||' '|| l.Segundo_Apellido AS 'Nombre Lider', t.Codigo_Tipo, t. Estrato FROM Proyecto p INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo WHERE p.Ciudad = 'Pereira' AND p.Fecha_Inicio BETWEEN '2019-09-01' AND '2019-09-09';";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                requerimiento_2.setFecIni(resultSet.getString("Fecha_Inicio"));
                requerimiento_2.setNombreCiudad(resultSet.getString("Ciudad"));
                requerimiento_2.setConstructora(resultSet.getString("Constructora"));
                requerimiento_2.setNombreLider(resultSet.getString("Nombre Lider"));
                requerimiento_2.setCodigoTipo(resultSet.getString("Codigo_Tipo"));
                requerimiento_2.setEstrato(resultSet.getInt("Estrato"));
                respuesta.add(requerimiento_2);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.out.println("Error de consulta SQL Requerimiento 2 -> " + e);
        } finally {
            if (conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }
}
