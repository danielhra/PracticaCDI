package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MostrarEventoAsignado extends AppCompatActivity {

    TextView nombre, fecha, desc, ubic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_evento_asignado);

        Intent intent = getIntent();

        nombre = findViewById(R.id.nombreEventoMP);
        fecha = findViewById(R.id.fechaEventoMP);
        desc = findViewById(R.id.descripcionEventoMP);
        ubic = findViewById(R.id.ubicacionEventoMP);

        nombre.setText(Datos.getDatos().getEventosAsig().get(intent.getIntExtra("posicion", 99)).nombre);
        fecha.setText(Datos.getDatos().getEventosAsig().get(intent.getIntExtra("posicion", 99)).fecha);
        desc.setText(Datos.getDatos().getEventosAsig().get(intent.getIntExtra("posicion", 99)).descripcion);
        ubic.setText(Datos.getDatos().getEventosAsig().get(intent.getIntExtra("posicion", 99)).ubicacion);


    }


    public void irAvisoAsistencia(View view) {
        startActivity(new Intent(this, AvisoAsistencia.class));
    }

}
