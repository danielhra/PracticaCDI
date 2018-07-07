package com.example.julian.cdi;

import java.io.Serializable;

public class Denuncia implements Serializable {
    String nombreCivil,dni,sexo,fecha,correo,telefono,direccion,descripcion,tipo,nombreP,numRef,placa;




   public Denuncia(String nombreCivil, String dni, String sexo, String fecha, String correo, String telefono, String direccion, String descripcion, String tipo,String nombreP,String numRef,String placa) {
        this.nombreCivil = nombreCivil;
        this.dni = dni;
        this.sexo = sexo;
        this.fecha = fecha;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.nombreP = nombreP;
        this.numRef = numRef;
        this.placa = placa;
    }


}
