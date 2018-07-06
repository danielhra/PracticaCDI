package com.example.julian.cdi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuJefatura extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jefatura);


    }

    public void irGestionDenuncias(View view) {
        startActivity(new Intent(this, GestionDenuncias.class));
    }

    public void irGestionEvento(View view) {
        startActivity(new Intent(this, ListadoEventos.class));
    }

    public void irAvisoEmergencia(View view) {
        startActivity(new Intent(this, ListadoEmergencia.class));
    }



}
