package com.example.julian.cdi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MostrarDenuncia extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_denuncia);
        Intent intent= getIntent();

        Denuncia denuncia = Datos.getDatos().getDenuncias().get(intent.getIntExtra("posicion",999));

        EditText tipo= findViewById(R.id.tipoDenunciaM);
        EditText nombreCivil= findViewById(R.id.nombreDenunciaM);
        EditText dni= findViewById(R.id.dniDenunciaM);
        EditText sexo= findViewById(R.id.sexoDenunciaM);
        EditText fecha= findViewById(R.id.fechaDenunciaM);
        EditText correo= findViewById(R.id.correoDenunciaM);
        EditText telefono = findViewById(R.id.telefonoDenunciaM);
        EditText direccion = findViewById(R.id.direccionDenunciaM);
        EditText descricion = findViewById(R.id.descripcionDenunciaM);
        EditText nombrePolicia = findViewById(R.id.nombrePoliciaDenunciaM);
        EditText placa = findViewById(R.id.placaPoliciaDenunciaM);
        EditText numref = findViewById(R.id.numRefDenunciaM);



        tipo.setText(denuncia.tipo);
        nombreCivil.setText(denuncia.nombreCivil);
        dni.setText(denuncia.dni);
        sexo.setText(denuncia.sexo);
        fecha.setText(denuncia.fecha);
        correo.setText(denuncia.correo);
        telefono.setText(denuncia.telefono);
        direccion.setText(denuncia.direccion);
        descricion.setText(denuncia.descripcion);
        nombrePolicia.setText(denuncia.nombreP);
        placa.setText(denuncia.placa);
        numref.setText(denuncia.numRef);

    }

    public void irMenu(View view) {
        startActivity(new Intent(this, MenuCivil.class));
    }
}
