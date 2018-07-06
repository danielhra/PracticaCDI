package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EventosPolicia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos_policia2);
    }

    public void irMostrarTodos(View view){
        startActivity(new Intent(this, TodosEventosPolicia.class));
    }

    public void irMostrarAsignados(View view){
        startActivity(new Intent(this, AsignadosEventosPolicia.class));
    }
}
