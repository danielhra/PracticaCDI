package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuSanciones extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sanciones);

    }
    public void irAtestados(View view) {
        startActivity(new Intent(this, FormularioAtestado.class));
    }
    public void irMultas(View view) {
        startActivity(new Intent(this, MenuMultas.class));
    }


}
