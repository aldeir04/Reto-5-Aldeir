/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic2022.c2.reto4.view;

import com.misiontic2022.c2.reto4.controller.ControllerRequerimientos;
import com.misiontic2022.c2.reto4.model.vo.Requerimiento_1;
import com.misiontic2022.c2.reto4.model.vo.Requerimiento_2;
import com.misiontic2022.c2.reto4.model.vo.Requerimiento_3;
//import java.awt.Graphics;
//import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
//import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YANK
 */
public class FrmRequerimientos extends javax.swing.JFrame {
//    FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form FrmRequerimientos
     */
    public FrmRequerimientos() {
//     this.setContentPane(fondo);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRequerimiento1 = new javax.swing.JButton();
        btnRequerimiento2 = new javax.swing.JButton();
        btnRequerimiento3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 2, 18)); // NOI18N
        jLabel1.setText("Futuros S.A.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 15, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tools.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 600, 330));

        btnRequerimiento1.setBackground(new java.awt.Color(0, 0, 153));
        btnRequerimiento1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRequerimiento1.setForeground(new java.awt.Color(255, 255, 255));
        btnRequerimiento1.setText(" Requerimiento 1");
        btnRequerimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequerimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnRequerimiento2.setBackground(new java.awt.Color(255, 255, 255));
        btnRequerimiento2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRequerimiento2.setForeground(new java.awt.Color(0, 0, 153));
        btnRequerimiento2.setText("Requerimiento 2");
        btnRequerimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequerimiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 52, -1, -1));

        btnRequerimiento3.setBackground(new java.awt.Color(0, 0, 153));
        btnRequerimiento3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRequerimiento3.setForeground(new java.awt.Color(255, 255, 255));
        btnRequerimiento3.setText("Requerimiento 3");
        btnRequerimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequerimiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 52, -1, -1));

        mTabla.setBackground(new java.awt.Color(255, 255, 102));
        mTabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mTabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        mTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(mTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 598, 332));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequerimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento1ActionPerformed
        
        //JOptionPane.showMessageDialog(this,"Aceptar","Confirmar", JOptionPane.INFORMATION_MESSAGE);
        String [] columnNombre = {"Fecha", "ID Compra", "Nombre Proveedor", "Pagado"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        ArrayList<Requerimiento_1> lista;
        try {
            lista = controlador.consultaRequerimiento_1();  
            Object[][] datos = new Object[lista.size()][4];
            int index = 0;
            
            for (Requerimiento_1 r: lista){
                datos[index][0]= r.getFechaCompra();
                datos[index][1]= r.getCodCompra();
                datos[index][2]= r.getNombreProveedor();
                datos[index][3]= r.getPagado();
                index++;
            }
            DefaultTableModel Model = new DefaultTableModel(datos,columnNombre);
            mTabla.setModel(Model);
        }catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento1ActionPerformed

    private void btnRequerimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento2ActionPerformed
        
        String [] columnNombre = {"Fec. Inicio", "Ciudad", "Constructora", "Nombre Lider", "Codigo Tipo", "Estrato"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        ArrayList<Requerimiento_2> lista;
        try {
            lista = controlador.consultaRequerimiento_2();  
            Object[][] datos = new Object[lista.size()][6];
            int index = 0;
            
            for (Requerimiento_2 r: lista){
                datos[index][0]= r.getFecIni();
                datos[index][1]= r.getNombreCiudad();
                datos[index][2]= r.getConstructora();
                datos[index][3]= r.getNombreLider();
                datos[index][4]= r.getCodigoTipo();
                datos[index][5]= r.getEstrato();
                
                index++;
            }
            DefaultTableModel Model = new DefaultTableModel(datos,columnNombre);
            mTabla.setModel(Model);
        }catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento2ActionPerformed

    private void btnRequerimiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento3ActionPerformed
        
        String [] columnNombre = {"Abrev."};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        ArrayList<Requerimiento_3> lista;
        try {
            lista = controlador.consultaRequerimiento_3();  
            Object[][] datos = new Object[lista.size()][1];
            int index = 0;
            
            for (Requerimiento_3 r: lista){
                datos[index][0]= r.getAbrev();
                
                index++;
            }
            DefaultTableModel Model = new DefaultTableModel(datos,columnNombre);
            mTabla.setModel(Model);
        }catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRequerimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequerimiento1;
    private javax.swing.JButton btnRequerimiento2;
    private javax.swing.JButton btnRequerimiento3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mTabla;
    // End of variables declaration//GEN-END:variables
    
//    class FondoPanel extends JPanel{
//        private Image imagen;
//        
//        @Override
//        public void paint (Graphics g){
//            imagen = new ImageIcon(getClass().getResource("/imagenes/tools.png")).getImage();
//            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
//            
//            setOpaque(false);
//            super.paint(g);
//        }
//    }        
}

