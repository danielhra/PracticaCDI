package com.example.julian.cdi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AsignarPredenuncia extends BaseActivity {


    ListView lv;
    ArrayList preDenuncias = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_denuncias);

        lv = (ListView) findViewById(R.id.listviewG);
        for (int i = 0; i < Datos.getDatos().getPreDenuncias().size(); i++) {
            preDenuncias.add("Denuncia " + i + "  Fecha:" + Datos.getDatos().getPreDenuncias().get(i).fechaDenuncia);
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, preDenuncias);
            lv.setAdapter(adaptador);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent i = new Intent(AsignarPredenuncia.this, MostrarAsignarPredenuncia.class);
                    i.putExtra("posicion", position);
                    startActivity(i);
                }
            });

        }


    }
}
