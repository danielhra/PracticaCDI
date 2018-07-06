package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuGestionDenuncias extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_gestion_denuncias);
    }
    public void irRecibidas(View view) {
        startActivity(new Intent(this, ListadoDenunciasRecibidas.class));
    }
    public void irEmitidas(View view) {
        startActivity(new Intent(this, ListadoDenunciasEmitidas.class));
    }
}
