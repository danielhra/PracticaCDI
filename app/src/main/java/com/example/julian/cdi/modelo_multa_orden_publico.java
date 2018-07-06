package com.example.julian.cdi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class modelo_multa_orden_publico extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelo_multa_orden_publico);
    }
    public void onToast_Mensaje(View view){
        Context context = getApplicationContext();
        CharSequence text = "MULTA GUARDADA";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void irFormularioMultas(View view) {
        Context context = getApplicationContext();
        CharSequence text = "MULTA GUARDADA Y ENVIADA";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        startActivity(new Intent(this, MenuPolicia.class));
    }
}
