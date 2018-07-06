package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.editText2);
        pass = (EditText) findViewById(R.id.editText3);
       // desc =(TextView) findViewById(R.id.textView3);
        //desc.setText("Aplicación policial ");//Se puede poner valores de atributos
    }

    public void irMenu(View view) {
        String dato = email.getText().toString();
        if (dato.contains("@policia.es")|| dato.contains("@policia.com"))
            startActivity(new Intent(this, MenuPolicia.class));

        else {
            if(dato.contains("@jefatura.es") || dato.contains("@jefatura.com"))
                startActivity(new Intent(this, MenuJefatura.class));
            else
                startActivity(new Intent(this, MenuCivil.class));
        }
    }

}
