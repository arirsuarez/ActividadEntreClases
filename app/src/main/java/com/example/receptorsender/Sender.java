package com.example.receptorsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Sender extends AppCompatActivity {

    public static final String APELLIDO = "apellido";
    public static final String NOMBRE = "nombre";
    public static final String EDAD = "edad";
    private EditText editTextNombreRecibido;
    private EditText editTextApellidoRecibido;
    private EditText editTextEdadRecibida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        editTextNombreRecibido = findViewById(R.id.editTextReceptorNombre);
        editTextApellidoRecibido = findViewById(R.id.editTextReceptorApellido);
        editTextEdadRecibida = findViewById(R.id.editTextReceptorEdad);


        Intent intentRecibido = getIntent();
        Bundle bundleRecibido = intentRecibido.getExtras();

        String nombreFinal = bundleRecibido.getString(NOMBRE);
        String apellidoFinal = bundleRecibido.getString(APELLIDO);
        String edadFinal = bundleRecibido.getString(EDAD);


        editTextNombreRecibido.setText(nombreFinal);
        editTextApellidoRecibido.setText(apellidoFinal);
        editTextEdadRecibida.setText(edadFinal);







    }
}
