package com.example.julian.cdi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class BuscarPredenuncia extends BaseActivity {

    ListView lv;
    ArrayList denunciasPendiente = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_predenuncia);

        lv= (ListView) findViewById(R.id.listviewPredenuncia);

        for (int i = 0; i < Datos.getDatos().getDenunciasPendientes().size(); i++) {
            denunciasPendiente.add("Denuncia: " + i + "  Fecha: " + Datos.getDatos().getDenunciasPendientes().get(i).fechaDenuncia);
        }


        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, denunciasPendiente);

        lv.setAdapter(adaptador);

        ImageButton buscar = (ImageButton)findViewById(R.id.buscarPredenuncia);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num = (EditText)findViewById(R.id.idPredenuncia);
                int id = Integer.parseInt(num.getText().toString());

                for (PreDenuncia preDenuncia:Datos.getDatos().getPreDenuncias()
                        ) {

                    if(preDenuncia.id == id){
                        Intent i = new Intent(BuscarPredenuncia.this,FormularioDenuncia.class);
                        i.putExtra("preDenuncia",preDenuncia);
                        //todo eliminar de pendiente
                        startActivity(i);

                    }

                }
            }
        });
    }

    public void irDenuncia(View view) {
        EditText num = (EditText)findViewById(R.id.idPredenuncia);
        int id = Integer.parseInt(num.getText().toString());

        for (PreDenuncia preDenuncia:Datos.getDatos().getPreDenuncias()
                ) {

            if(preDenuncia.id == id){
                Intent i = new Intent(BuscarPredenuncia.this,FormularioDenuncia.class);
                i.putExtra("preDenuncia",preDenuncia);
                startActivity(i);

            }

        }

    }



    }
