package com.example.julian.cdi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AvisoEnviado extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso_enviado);
    }

    public void irMenu(android.view.View view) {
        startActivity(new android.content.Intent(this, MenuCivil.class));
    }
}
