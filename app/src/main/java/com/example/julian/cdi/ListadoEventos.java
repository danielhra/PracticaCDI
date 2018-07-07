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

        for (int i = 0; i < Datos.getDatos().getEventos().size(); i++) {
            eventos.add("Evento:"+ Datos.getDatos().getEventos().get(i).nombre+"  Fecha:"+Datos.getDatos().getEventos().get(i).fecha);        }


        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, eventos) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = (TextView) view.findViewById(android.R.id.text1);
                TextView text2 = (TextView) view.findViewById(android.R.id.text2);

                text2.setText("policia asignado =" + position);
                return view;
            }
        };




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
