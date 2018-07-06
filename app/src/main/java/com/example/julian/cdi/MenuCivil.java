package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuCivil extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_civil);
    }
    public void irNuevaPredenuncia(View view) {
        startActivity(new Intent(this, FormularioPredenuncia.class));
    }
    public void irSocorro(View view) {
        startActivity(new Intent(this, AvisoSocorro.class));
    }

    public void irListadoDenuncias(View view){
        startActivity(new Intent(this, MenuGestionDenuncias.class));
    }
}
