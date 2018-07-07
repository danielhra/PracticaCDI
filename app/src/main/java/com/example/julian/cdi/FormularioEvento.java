package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class FormularioEvento extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_evento);


    }


    public void crearEvento(View view) {

        insertarDatos();
        startActivity(new Intent(this, ListadoEventos.class));
    }

    private void insertarDatos() {

        EditText nombre   = (EditText)findViewById(R.id.nombreEvento);
        EditText fecha   = (EditText)findViewById(R.id.fechaEvento);
        EditText desc   = (EditText)findViewById(R.id.descripcionEvento);
        EditText ubic   = (EditText)findViewById(R.id.ubicacionEvento);


        Evento evento = new Evento(nombre.getText().toString(),fecha.getText().toString(),desc.getText().toString(),ubic.getText().toString());

        Datos.getDatos().addEvento(evento);
    }

}
