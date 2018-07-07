package com.example.julian.cdi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MostrarAsignarPredenuncia extends BaseActivity {

    EditText nombre, dni, sexo, fecha, correo, telefono, direccion, descripcion, tipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_asignar_predenuncia);

        Spinner spinner = findViewById(R.id.spinnerPredenunciaM);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.agentes, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        Intent intent = getIntent();

        nombre = findViewById(R.id.nombrePredenunciaM);
        dni = findViewById(R.id.dniPredenunciaM);
        sexo = findViewById(R.id.sexoPredenunciaM);
        fecha = findViewById(R.id.fechaPredenunciaM);
        correo = findViewById(R.id.correoPredenunciaM);
        telefono = findViewById(R.id.telefonoPredenunciaM);
        direccion = findViewById(R.id.direccionPredenunciaM);
        descripcion = findViewById(R.id.descripcionPredenunciaM);
        tipo = findViewById(R.id.tipoPredenunciaM);




        nombre.setText(Datos.getDatos().getPreDenuncias().get(intent.getIntExtra("posicion", 99)).nombre);
        dni.setText(Datos.getDatos().getPreDenuncias().get(intent.getIntExtra("posicion", 99)).dni);
        sexo.setText(Datos.getDatos().getPreDenuncias().get(intent.getIntExtra("posicion", 99)).sexo);
        fecha.setText(Datos.getDatos().getPreDenuncias().get(intent.getIntExtra("posicion", 99)).fechaDenuncia);
        correo.setText(Datos.getDatos().getPreDenuncias().get(intent.getIntExtra("posicion", 99)).correo);
        telefono.setText(Datos.getDatos().getPreDenuncias().get(intent.getIntExtra("posicion", 99)).telefono);
        direccion.setText(Datos.getDatos().getPreDenuncias().get(intent.getIntExtra("posicion", 99)).direccion);
        descripcion.setText(Datos.getDatos().getPreDenuncias().get(intent.getIntExtra("posicion", 99)).descripcion);
        tipo.setText(Datos.getDatos().getPreDenuncias().get(intent.getIntExtra("posicion", 99)).tipo);

    }

    public void irAvisoNotificacion(View view) {

        PreDenuncia denunciaPendiente = Datos.getDatos().getPreDenuncias().get(getIntent().getIntExtra("posicion",99));
        Datos.getDatos().addDenunciaPend(denunciaPendiente);

        Datos.getDatos().getPreDenuncias().remove(denunciaPendiente);


        startActivity(new Intent(this, AvisoNotificacion.class));
    }
}
