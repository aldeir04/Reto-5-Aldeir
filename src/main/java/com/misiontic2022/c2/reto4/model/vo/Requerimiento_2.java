package com.misiontic2022.c2.reto4.model.vo;

public class Requerimiento_2 {
    private String fecIni;
    private String nombreCiudad;
    private String constructora;
    private String nombreLider;
    private String codigoTipo;
    private Integer estrato;
    
    public Requerimiento_2(){}    

    public Requerimiento_2(String fecIni, String nombreCiudad, String constructora, String nombreLider, String codigoTipo, Integer estrato) {
        this.fecIni = fecIni;
        this.nombreCiudad = nombreCiudad;
        this.constructora = constructora;
        this.nombreLider = nombreLider;
        this.codigoTipo = codigoTipo;
        this.estrato = estrato;
    }

    public String getFecIni() {
        return fecIni;
    }
    public void setFecIni(String fecIni) {
        this.fecIni = fecIni;
    }
    public String getNombreCiudad() {
        return nombreCiudad;
    }
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public String getNombreLider() {
        return nombreLider;
    }
    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }
    public String getCodigoTipo() {
        return codigoTipo;
    }
    public void setCodigoTipo(String codigoTipo) {
        this.codigoTipo = codigoTipo;
    }
    public Integer getEstrato() {
        return estrato;
    }
    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
}
