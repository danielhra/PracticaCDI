package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AvisoSocorro extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso_socorro);
    }
    public void irAvisoRobo(View v) {
        Datos.getDatos().addAviso(new Aviso(Aviso.Tipo.Robo));
        startActivity(new Intent(this, AvisoEnviado.class));
    }
    public void irAvisoVandalismo(View v) {
        Datos.getDatos().addAviso(new Aviso(Aviso.Tipo.Vandalismo));
        startActivity(new Intent(this, AvisoEnviado.class));
    }
    public void irAvisoGenero(View v) {
        Datos.getDatos().addAviso(new Aviso(Aviso.Tipo.ViolenciaGenero));
        startActivity(new Intent(this, AvisoEnviado.class));
    }
    public void irAvisoRadical(View v) {
        Datos.getDatos().addAviso(new Aviso(Aviso.Tipo.Radicalismo));
        startActivity(new Intent(this, AvisoEnviado.class));
    }
    public void irAvisoSexual(View v) {
        Datos.getDatos().addAviso(new Aviso(Aviso.Tipo.AgresionSexual));
        startActivity(new Intent(this, AvisoEnviado.class));
    }
    public void irAvisoDesaparecido(View v) {
        Datos.getDatos().addAviso(new Aviso(Aviso.Tipo.Desaparecido));
        startActivity(new Intent(this, AvisoEnviado.class));
    }
}
