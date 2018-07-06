package com.example.julian.cdi;

public class Atestado {
    String nombre, numPlaca, fecha,numReferencia, descripcion;

    public Atestado(String nombre, String numPlaca, String fecha, String numReferencia, String descripcion) {
        this.nombre = nombre;
        this.numPlaca = numPlaca;
        this.fecha = fecha;
        this.numReferencia = numReferencia;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(String numReferencia) {
        this.numReferencia = numReferencia;
    }
}
