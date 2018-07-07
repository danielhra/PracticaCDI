package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AvisoAsistencia extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso_asistencia);

        if(getIntent().getStringExtra("mensaje") != null){

            TextView aviso = findViewById(R.id.avisoPolicia);

            aviso.setText(getIntent().getStringExtra("mensaje"));

        }


    }

    public void irMenuPolicia(View view) {
        startActivity(new Intent(this, MenuPolicia.class));
    }

}
