package com.example.julian.cdi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class FormularioAtestado extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_atestado);

    }

    private void insertarDatos() {

        EditText nombre   = (EditText)findViewById(R.id.nombreAtestado);
        EditText numPlaca   = (EditText)findViewById(R.id.numPlacaAtestados);
        EditText numReferencia   = (EditText)findViewById(R.id.numReferenciaAtestados);
        EditText descripcion   = (EditText)findViewById(R.id.descripcionAtestado);
        EditText fecha   = (EditText)findViewById(R.id.fechaAtestados);

        Atestado atestado = new Atestado(nombre.getText().toString(),numPlaca.getText().toString(),fecha.getText().toString(),numReferencia.getText().toString(),descripcion.getText().toString());
        Datos.getDatos().addAtestado(atestado);
    }

    public void onToast_Mensaje(View view){
        Context context = getApplicationContext();
        CharSequence text = "ATESTADO GUARDADO";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    public void irMenuPolicica(View view) {
        Context context = getApplicationContext();
        CharSequence text = "ATESTADO GUARDADO Y ENVIADO";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        startActivity(new Intent(this, MenuPolicia.class));
    }
}
