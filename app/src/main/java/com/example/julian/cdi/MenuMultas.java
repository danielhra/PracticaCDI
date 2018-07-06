package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MenuMultas extends BaseActivity implements AdapterView.OnItemSelectedListener {
    String []infracciones={"INFRACCION ORDEN PUBLICO", "INFRACCION TRAFICO", "NFRACCION FISCAL", "INFRACCION TRIBUTARIA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_multas);
        //Spinner spin = (Spinner) findViewById (R.id.desplegable);
        //spin.setOnItemSelectedListener ( this );

        // Creando la instancia ArrayAdapter que tiene la lista de países
        ArrayAdapter aa =  new  ArrayAdapter ( this , android.R.layout.simple_spinner_item, infracciones);
        aa.setDropDownViewResource (android.R.layout.simple_spinner_dropdown_item);
        // Configurar los datos de ArrayAdapter en el Spinner
        //spin.setAdapter (aa);
    }
    @Override
    public void  onItemSelected (AdapterView <?> arg0, View arg1, int  position, long  id) {
        Toast.makeText (getApplicationContext (), infracciones [position], Toast.LENGTH_LONG) .show ();
    }

    @Override
    public void  onNothingSelected (AdapterView <?> arg0) {
        // TODO trozo de método generado automáticamente

    }
    public void irformularioMultas(View view) {
        startActivity(new Intent(this, FormularioMulta.class));
    }
    public void irformularioMultas_orden_publico(View view) {
        startActivity(new Intent(this, modelo_multa_orden_publico.class));
    }
   // @Override
   /*public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.layout.activity_menu_multas, menu);
        return true;*/
}
