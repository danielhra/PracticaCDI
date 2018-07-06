package com.example.julian.cdi;

import java.util.ArrayList;


public class Datos {

    private static Datos datos = null;
    private ArrayList <Usuario> users;
    private ArrayList <Denuncia> denuncias;
    private ArrayList <Atestado> atestados;
    private ArrayList <PreDenuncia> preDenuncias;
    private ArrayList <PreDenuncia> denunciasPendientes;
    private ArrayList <Aviso> avisos;
    private ArrayList <Evento> eventos;
    private ArrayList <Evento> eventosAsig;
    private ArrayList <Denuncia> denunciasRecibidas;

    public ArrayList<Denuncia> getDenunciasRecibidas() {
        return denunciasRecibidas;
    }

    public void setDenunciasRecibidas(ArrayList<Denuncia> denunciasRecibidas) {
        this.denunciasRecibidas = denunciasRecibidas;
    }

    public ArrayList<PreDenuncia> getDenunciasPendientes() {
        return denunciasPendientes;
    }

    public ArrayList<Evento> getEventosAsig() {
        return eventosAsig;
    }

    public ArrayList<Aviso> getAvisos() {return avisos;}

    public void setAvisos(ArrayList<Aviso> avisos) {this.avisos = avisos;}

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Denuncia> getDenuncias() {
        return denuncias;
    }

    public ArrayList<Atestado> getAtestados() {
        return atestados;
    }

    public ArrayList<PreDenuncia> getPreDenuncias() {
        return preDenuncias;
    }

    public static Datos getDatos() {

        if(datos == null){
            datos = new Datos();
            return datos;

        }else {
            return datos;
        }
    }

    public static void setDatos(Datos datos) {
        Datos.datos = datos;
    }

    private Datos (){

        users = new ArrayList<>();

        denuncias = new ArrayList<>();

        Denuncia denuncia1 = new Denuncia("Julian Martin Arias","4554523S","M","16/6/2016","juli@juli.com","67672399723","estados unidos","Fui agredido por una banda de maleantes","daño a propiedad","Daniel","23456F","276FRT");
        Denuncia denuncia2 = new Denuncia("Mariano Hernesto","455asdasd3S","M","16/6/2015","Mariano@juli.com","6767236623","estados unidos","Daño colateral","Hurto","Carlos","21256F","945LKJ");

        denuncias.add(denuncia1);
        denuncias.add(denuncia2);


        atestados = new ArrayList<>();

        preDenuncias = new ArrayList<>();

        PreDenuncia PD = new PreDenuncia("Mauricio","51365289O","M","5/2/2018","mauri@gmail.com","687598499","calle Pez 27 4ºI","Me han quitado el movil sin que me de cuenta en la plaza del medio del pueblo de abajo","HURTO",0);
        preDenuncias.add(PD);

        denunciasPendientes = new ArrayList<>();

        denunciasPendientes.add(PD);


        eventos = new ArrayList<>();


        Evento evento1 = new Evento("loolapalooza","27/12/2001","madrid","evento de musica EDM");
        Evento evento2 = new Evento("manifestacion","15/06/2018","barcelona","mejores pagas para los profesores");

        eventos.add(evento1);
        eventos.add(evento2);

        avisos = new ArrayList<>();

        avisos.add(new Aviso(Aviso.Tipo.Robo));
        avisos.add(new Aviso(Aviso.Tipo.Vandalismo));
        avisos.add(new Aviso(Aviso.Tipo.Desaparecido));
        avisos.add(new Aviso(Aviso.Tipo.Radicalismo));


        denunciasRecibidas = new ArrayList<>();

        Denuncia denunciar1 = new Denuncia("carlos","4554523S","M","16/6/2016","juli@juli.com","67672399723","estados unidos","Fui agredido por una banda de maleantes","daño a propiedad","Daniel","23456F","276FRT");
        Denuncia denunciar2 = new Denuncia("Mariano Hernesto","455asdasd3S","M","16/6/2015","Mariano@juli.com","6767236623","estados unidos","Daño colateral","Hurto","Carlos","21256F","945LKJ");

        denunciasRecibidas.add(denunciar1);
        denunciasRecibidas.add(denunciar2);

        eventosAsig = new ArrayList<>();

        eventosAsig.add(evento1);
    }

    public void addAtestado (Atestado atestado){
        atestados.add(atestado);
    }

    public void addEvento(Evento evento) { eventos.add(evento); }

    public void addPreDenuncia (PreDenuncia preDenuncia){
        preDenuncias.add(preDenuncia);
    }

    public void addDenuncia(Denuncia denuncia) { denuncias.add(denuncia);}

    public void addAviso(Aviso aviso){avisos.add(aviso);}

    public void deleteAviso(int pos){avisos.remove(pos); }

    public void addDenunciaPend(PreDenuncia preDenuncia) { denunciasPendientes.add(preDenuncia);}

    public void removeDenuncia(Denuncia denuncia) { denunciasPendientes.remove(denuncia);}

    public void addEventoAsig(Evento evento) { eventosAsig.add(evento); }

    public void addDenunciaRecibida(Denuncia denuncia) { denunciasRecibidas.add(denuncia);}




}

