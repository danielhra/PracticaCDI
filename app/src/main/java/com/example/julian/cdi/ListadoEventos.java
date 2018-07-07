package com.example.julian.cdi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListadoEventos extends BaseActivity {

    ListView lv;
    ArrayList eventos = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_eventos);


        lv= (ListView) findViewById(R.id.listviewE);

        for (int i = 0; i < Datos.getDatos().getEventosNoAsig().size(); i++) {
            eventos.add("Evento:"+ Datos.getDatos().getEventosNoAsig().get(i).nombre+"  Fecha:"+Datos.getDatos().getEventosNoAsig().get(i).fecha);        }


        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, eventos);


        lv.setAdapter(adaptador);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListadoEventos.this, MostrarEvento.class);
                i.putExtra("posicion",position);
                startActivity(i);
            }
        });
    }

    public void irNuevoEvento(View view) {
        startActivity(new Intent(this, FormularioEvento.class));
    }}
