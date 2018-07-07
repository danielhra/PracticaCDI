package com.example.julian.cdi;

import java.io.Serializable;

public class PreDenuncia implements Serializable{
    String nombre, dni, sexo, fechaDenuncia, correo, telefono, direccion, descripcion, tipo;
    int id;

    public PreDenuncia(int id){
        this.id= id;
    }

    public PreDenuncia(String nombre, String dni, String sexo, String fechaDenuncia, String correo, String telefono, String direccion, String descripcion, String tipo, int id) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.fechaDenuncia = fechaDenuncia;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.id = id;
    }
}
