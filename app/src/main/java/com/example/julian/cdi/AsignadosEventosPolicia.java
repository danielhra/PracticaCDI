package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AsignadosEventosPolicia extends AppCompatActivity {

    ListView lv;
    ArrayList eventos = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asignados_eventos_policia);


        lv= (ListView) findViewById(R.id.listviewAsignadosEventos);

        for (int i = 0; i < Datos.getDatos().getEventosAsig().size(); i++) {
            eventos.add("Evento:"+ Datos.getDatos().getEventosAsig().get(i).nombre+"  Fecha:"+Datos.getDatos().getEventosAsig().get(i).fecha);
        }


        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, eventos);




        lv.setAdapter(adaptador);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(AsignadosEventosPolicia.this, MostrarEventoAsignado.class);
                i.putExtra("posicion",position);
                startActivity(i);
            }
        });
    }
}
