package com.example.julian.cdi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class FormularioPredenuncia extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_predenuncia);

        Spinner spinner = findViewById(R.id.spinnerPredenuncia);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tipoDenuncia, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


    }


    public void enviarPredenuncia(View view) {

        insertarDatos();

        Intent intent= new Intent(this, AvisoCreacionPreDenuncia.class);

        intent.putExtra("mensaje","SE HA REALIZADO LA PREDENUNCIA");

        startActivity(intent);
    }

    public void guardarPredenuncia(View view) {

        Intent intent= new Intent(this, AvisoCreacionPreDenuncia.class);

        intent.putExtra("mensaje","SE HA GUARDADO LA PREDENUNCIA");

        startActivity(intent);

    }

    private void insertarDatos() {

        EditText nombre   = (EditText)findViewById(R.id.nombrePredenuncia);
        EditText dni   = (EditText)findViewById(R.id.dniPredenuncia);
        EditText sexo   = (EditText)findViewById(R.id.sexoPredenuncia);
        EditText fecha   = (EditText)findViewById(R.id.fechaPredenuncia);
        EditText correo   = (EditText)findViewById(R.id.correoPredenuncia);
        EditText telefono   = (EditText)findViewById(R.id.telefonoPredenuncia);
        EditText direccion   = (EditText)findViewById(R.id.direccionPredenuncia);
        EditText descripcion   = (EditText)findViewById(R.id.descripcionPredenuncia);
        Spinner spinner = (Spinner)findViewById(R.id.spinnerPredenuncia);


        PreDenuncia preDenuncia = new PreDenuncia(nombre.getText().toString(),dni.getText().toString(),sexo.getText().toString(),fecha.getText().toString(),correo.getText().toString(),telefono.getText().toString(),direccion.getText().toString(),descripcion.getText().toString(),spinner.getSelectedItem().toString(),Datos.getDatos().getPreDenuncias().size());

        Datos.getDatos().addPreDenuncia(preDenuncia);
        }


}
