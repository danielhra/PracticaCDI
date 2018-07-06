package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MenuPolicia extends BaseActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_policia);


    }
    public void irPredenuncia(View view) {
        startActivity(new Intent(this, BuscarPredenuncia.class));
    }
    public void irSanciones(View view) {
        startActivity(new Intent(this, MenuSanciones.class));
    }

    public void irEventosPolicia(View view) {
        startActivity(new Intent(this, EventosPolicia.class));
    }

}
