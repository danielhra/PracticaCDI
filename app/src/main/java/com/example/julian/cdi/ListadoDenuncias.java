package com.example.julian.cdi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListadoDenuncias extends BaseActivity {


    ListView lv;
    ArrayList denuncias = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_denuncias);
        lv= (ListView) findViewById(R.id.listviewL);
        for (int i = 0; i < Datos.getDatos().getDenuncias().size(); i++) {
            denuncias.add("Denuncia "+i+"  Fecha:"+Datos.getDatos().getDenuncias().get(i).fechaNac);
        }
        ArrayAdapter <String>adaptador = new ArrayAdapter <String>(this , android.R.layout.simple_list_item_1 , denuncias);
        lv.setAdapter(adaptador);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListadoDenuncias.this, MostrarDenuncia.class);
                i.putExtra("posicion",position);
                startActivity(i);
            }
        });
    }
}
