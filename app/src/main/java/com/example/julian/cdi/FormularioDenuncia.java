package com.example.julian.cdi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class FormularioDenuncia extends BaseActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_denuncia);

        Intent i = getIntent();

        PreDenuncia preDenuncia = (PreDenuncia)i.getSerializableExtra("preDenuncia");

        EditText tipo= findViewById(R.id.tipoDenuncia);
        EditText nombreCivil= findViewById(R.id.nombreDenuncia);
        EditText dni= findViewById(R.id.dniDenuncia);
        EditText sexo= findViewById(R.id.sexoDenuncia);
        EditText fecha= findViewById(R.id.fechaDenuncia);
        EditText correo= findViewById(R.id.correoDenuncia);
        EditText telefono = findViewById(R.id.telefonoDenuncia);
        EditText direccion = findViewById(R.id.direccionDenuncia);
        EditText descricion = findViewById(R.id.descripcionDenuncia);


        tipo.setText(preDenuncia.tipo);
        nombreCivil.setText(preDenuncia.nombre);
        dni.setText(preDenuncia.dni);
        sexo.setText(preDenuncia.sexo);
        fecha.setText(preDenuncia.fechaDenuncia);
        correo.setText(preDenuncia.correo);
        telefono.setText(preDenuncia.telefono);
        direccion.setText(preDenuncia.direccion);
        descricion.setText(preDenuncia.descripcion);


    }

    public void crearDenuncia(View view) {

        insertarDatos();

        Datos.getDatos().deleteDenunciaPendiente((PreDenuncia) getIntent().getSerializableExtra("preDenuncia"));

        Intent intent = new Intent(this, AvisoAsistencia.class);
        intent.putExtra("mensaje","SE HA CREADO LA DENUNCIA");
        startActivity(intent);
    }


    private void insertarDatos() {

        PreDenuncia preDenuncia = (PreDenuncia)getIntent().getSerializableExtra("preDenuncia");

        EditText nombreP = findViewById(R.id.nombrePoliciaDenuncia);
        EditText placa = findViewById(R.id.placaPoliciaDenuncia);
        EditText numRef = findViewById(R.id.numRefDenuncia);

        Denuncia denuncia = new Denuncia(preDenuncia.nombre, preDenuncia.dni, preDenuncia.sexo, preDenuncia.fechaDenuncia, preDenuncia.correo, preDenuncia.telefono, preDenuncia.direccion, preDenuncia.descripcion, preDenuncia.tipo, nombreP.getText().toString(), numRef.getText().toString(), placa.getText().toString());


        //todo añadir denuncia a otro sitio tambien
        Datos.getDatos().deleteDenunciaPendiente(preDenuncia);
        Datos.getDatos().addDenuncia(denuncia);

    }
}
