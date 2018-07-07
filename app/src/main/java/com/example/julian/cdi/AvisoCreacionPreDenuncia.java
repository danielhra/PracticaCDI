package com.example.julian.cdi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AvisoCreacionPreDenuncia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso_creacion_pre_denuncia);

        if(getIntent().getStringExtra("mensaje") != null){
            TextView aviso = findViewById(R.id.avisoCivil);
            aviso.setText(getIntent().getStringExtra("mensaje"));
        }
    }
    public void irMenu(android.view.View view) {
        startActivity(new android.content.Intent(this, MenuCivil.class));
    }
}
