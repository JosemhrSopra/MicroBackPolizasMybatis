package com.aseguradora.microbackpolizas.beans;

public class Poliza {
    private Integer idpoliza;

    private Integer numpoliza;

    private Integer numsup;

    private Integer idproducto;

    private String estado;

    public Integer getIdpoliza() {
        return idpoliza;
    }

    public void setIdpoliza(Integer idpoliza) {
        this.idpoliza = idpoliza;
    }

    public Integer getNumpoliza() {
        return numpoliza;
    }

    public void setNumpoliza(Integer numpoliza) {
        this.numpoliza = numpoliza;
    }

    public Integer getNumsup() {
        return numsup;
    }

    public void setNumsup(Integer numsup) {
        this.numsup = numsup;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}