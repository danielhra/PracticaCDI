package com.example.julian.cdi;

class Aviso {

    public static enum Tipo {Robo,AgresionSexual, Desaparecido, Radicalismo, ViolenciaGenero,Vandalismo};

    private Tipo tipoAviso;

    public Aviso(Tipo tipoAviso) {
        this.tipoAviso = tipoAviso;
    }

    public Tipo getTipoAviso() {
        return tipoAviso;
    }

    public void setTipoAviso(Tipo tipoAviso) {
        this.tipoAviso = tipoAviso;
    }






}
