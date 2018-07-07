package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListadoDenunciasRecibidas extends BaseActivity {

    ListView lv;
    ArrayList denuncias = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_denuncias_recibidas);

        lv= (ListView) findViewById(R.id.listviewR);
        for (int i = 0; i < Datos.getDatos().getDenuncias().size(); i++) {
            denuncias.add("Denuncia "+i+"  Fecha:"+Datos.getDatos().getDenuncias().get(i).fecha);
        }
        ArrayAdapter<String> adaptador = new ArrayAdapter <String>(this , android.R.layout.simple_list_item_1 , denuncias);
        lv.setAdapter(adaptador);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListadoDenunciasRecibidas.this, MostrarDenuncia.class);
                i.putExtra("posicion",position);
                startActivity(i);
            }
        });
    }
}
