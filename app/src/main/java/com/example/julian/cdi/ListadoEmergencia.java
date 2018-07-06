package com.example.julian.cdi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListadoEmergencia extends BaseActivity {


    ListView lv;
    ArrayList avisos = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_emergencia);

        lv= (ListView) findViewById(R.id.listviewEmergencia);
        for (int i = 0; i < Datos.getDatos().getAvisos().size(); i++) {
            avisos.add("Aviso "+i+"  Tipo:"+Datos.getDatos().getAvisos().get(i).getTipoAviso());
        }
        ArrayAdapter<String> adaptador = new ArrayAdapter <String>(this , android.R.layout.simple_list_item_1 , avisos);
        lv.setAdapter(adaptador);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListadoEmergencia.this, PriorizadoEmergencia.class);
                i.putExtra("posicion",position);
                Datos.getDatos().deleteAviso(position);
                startActivity(i);
            }
        });
    }
}

