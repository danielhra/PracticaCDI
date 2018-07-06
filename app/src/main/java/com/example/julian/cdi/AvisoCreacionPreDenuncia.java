package com.example.julian.cdi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AvisoCreacionPreDenuncia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso_creacion_pre_denuncia);
    }
    public void irMenu(android.view.View view) {
        startActivity(new android.content.Intent(this, MenuCivil.class));
    }
}
