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

        setContentView(R.layout.activity_formulario_denuncia);
        setTitle("FORMULARIO DENUNCIA");

        Intent i = getIntent();

        PreDenuncia preDenuncia = (PreDenuncia)i.getSerializableExtra("preDenuncia");

        TextView nombreCivil = (TextView)findViewById(R.id.nombreCivilDenuncia);
        TextView dniCivil = (TextView) findViewById(R.id.dniCivilDenuncia);
        TextView descripcionCivil = (TextView) findViewById(R.id.descripcionCivilDenuncia);
        nombreCivil.setText(preDenuncia.nombre);
        dniCivil.setText(preDenuncia.dni);
        descripcionCivil.setText(preDenuncia.descripcion);

        ImageButton enviar = findViewById(R.id.enviarDenuncia);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insertarDatos();

                startActivity(new Intent(v.getContext(), MenuPolicia.class));
            }
        });


    }


    private void insertarDatos() {

        PreDenuncia preDenuncia = (PreDenuncia)getIntent().getSerializableExtra("preDenuncia");

        EditText nombreP = findViewById(R.id.nombreDenuncia);
        EditText placa = findViewById(R.id.placaDenuncia);
        EditText numRef = findViewById(R.id.numRefDenuncia);

        Denuncia denuncia = new Denuncia(preDenuncia.nombre, preDenuncia.dni, preDenuncia.sexo, preDenuncia.fechaDenuncia, preDenuncia.correo, preDenuncia.telefono, preDenuncia.direccion, preDenuncia.descripcion, preDenuncia.tipo, nombreP.getText().toString(), numRef.getText().toString(), placa.getText().toString());


        Datos.getDatos().addDenuncia(denuncia);




    }
}
