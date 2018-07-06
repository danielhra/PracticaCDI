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
    TextView numref;
    TextView fecha;
    TextView estado;
    TextView descripcion;
    EditText alegaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_denuncia);
        Intent intent= getIntent();
        numref= findViewById(R.id.numRefMostrar);
        fecha= findViewById(R.id.fechaMostrar);
        estado= findViewById(R.id.estadoMostrar);
        descripcion= findViewById(R.id.descripcionMostrar);
        alegaciones= findViewById(R.id.alegacionesMostrar);
        numref.setText(Datos.getDatos().getDenuncias().get(intent.getIntExtra("posicion",9999)).numRef);
        fecha.setText(Datos.getDatos().getDenuncias().get(intent.getIntExtra("posicion",9999)).fechaNac);
        estado.setText("Activo");
        descripcion.setText(Datos.getDatos().getDenuncias().get(intent.getIntExtra("posicion",9999)).descripcion);
    }

    public void irMenu(View view) {
        Context context = getApplicationContext();
        CharSequence text = "MODIFICACIÓN GUARDADA Y ENVIADA";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        startActivity(new Intent(this, MenuCivil.class));
    }
    public void onToast_Mensaje(View view){
        Context context = getApplicationContext();
        CharSequence text = "MODIFICACIÓN GUARDADA";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
