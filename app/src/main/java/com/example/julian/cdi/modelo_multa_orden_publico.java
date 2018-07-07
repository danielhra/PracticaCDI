package com.example.julian.cdi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class modelo_multa_orden_publico extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelo_multa_orden_publico);
    }


    public void irMenuPolicia(View view) {

        Intent intent = new Intent(this, AvisoAsistencia.class);

        intent.putExtra("mensaje","SE HA CREADO LA MULTA");
        startActivity(intent);
    }

    public void Guardar(View view){
        Intent intent = new Intent(this, AvisoAsistencia.class);

        intent.putExtra("mensaje","SE HA GUARDADO LA MULTA");
        startActivity(intent);
    }
}
