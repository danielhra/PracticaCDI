package com.example.julian.cdi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FormularioMulta extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_multa);
    }


    public void irMenuPolicia(View view) {

        Intent intent = new Intent(this, AvisoAsistencia.class);

        intent.putExtra("mensaje","SE HA CREADO EL ATESTADO");
        startActivity(intent);
    }

    public void Guardar(View view){
        Intent intent = new Intent(this, AvisoAsistencia.class);

        intent.putExtra("mensaje","SE HA GUARDADO EL ATESTADO");
        startActivity(intent);
    }
}


