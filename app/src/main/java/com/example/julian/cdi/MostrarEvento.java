package com.example.julian.cdi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MostrarEvento extends BaseActivity {

    TextView nombre,fecha,desc,ubic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_evento);

        Spinner spinner = findViewById(R.id.spinnerevento);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.agentes, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        Intent intent= getIntent();

        nombre = findViewById(R.id.nombreEventoM);
        fecha = findViewById(R.id.fechaEventoM);
        desc = findViewById(R.id.descripcionEventoM);
        ubic = findViewById(R.id.ubicacionEventoM);

        nombre.setText(Datos.getDatos().getEventosNoAsig().get(intent.getIntExtra("posicion",99)).nombre);
        fecha.setText(Datos.getDatos().getEventosNoAsig().get(intent.getIntExtra("posicion",99)).fecha);
        desc.setText(Datos.getDatos().getEventosNoAsig().get(intent.getIntExtra("posicion",99)).descripcion);
        ubic.setText(Datos.getDatos().getEventosNoAsig().get(intent.getIntExtra("posicion",99)).ubicacion);

        if(intent.getStringExtra("imagenes") != null){
            ImageButton enviar = findViewById(R.id.enviar);
            TextView enviar1 = findViewById(R.id.enviar1);

            enviar.setVisibility(View.GONE);
            enviar1.setVisibility(View.GONE);
            spinner.setVisibility(View.GONE);

        }


    }

    public void irAvisoNotificacion(View view) {

        // Datos.getDatos().getEventosAsig().add(Datos.getDatos().getEventos().get(getIntent().getIntExtra("posicion",99)));


        Evento evento = Datos.getDatos().getEventosNoAsig().get(getIntent().getIntExtra("posicion",99));

        Datos.getDatos().getEventos().add(evento);
        Datos.getDatos().getEventosNoAsig().remove(evento);

        Intent intent = new Intent(this, AvisoNotificacion.class);

        intent.putExtra("posicion",getIntent().getIntExtra("posicion",99));
        startActivity(intent);
    }
}
