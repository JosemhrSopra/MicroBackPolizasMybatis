package com.aseguradora.microbackpolizas.beans;

public class Tomador {
    private Integer idtomador;

    private String nombre;

    private String apellidos;

    private String dni;

    public Integer getIdtomador() {
        return idtomador;
    }

    public void setIdtomador(Integer idtomador) {
        this.idtomador = idtomador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}