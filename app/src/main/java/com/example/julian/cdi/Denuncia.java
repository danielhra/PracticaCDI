package com.example.julian.cdi;

public class Denuncia {
    String nombreCivil,dni,sexo,fechaNac,correo,telefono,direccion,descripcion,tipo,nombreP,numRef,placa;




   public Denuncia(String nombreCivil, String dni, String sexo, String fechaNac, String correo, String telefono, String direccion, String descripcion, String tipo,String nombreP,String numRef,String placa) {
        this.nombreCivil = nombreCivil;
        this.dni = dni;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
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
