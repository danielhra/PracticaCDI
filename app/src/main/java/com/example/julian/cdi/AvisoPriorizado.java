package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AvisoPriorizado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso_priorizado);
    }

    public void irMenuJefatura(View view) {
        startActivity(new Intent(this, MenuJefatura.class));
    }

}
