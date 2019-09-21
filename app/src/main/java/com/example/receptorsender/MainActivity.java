package com.example.receptorsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.receptorsender.Sender.APELLIDO;
import static com.example.receptorsender.Sender.EDAD;
import static com.example.receptorsender.Sender.NOMBRE;

public class MainActivity extends AppCompatActivity {

    private Button buttonSend;
    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = findViewById(R.id.buttonEnviar);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextEdad = findViewById(R.id.editTextEdad);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editTextNombre.getText().toString();
                String apellido = editTextApellido.getText().toString();
                String edad = editTextEdad.getText().toString();

                Intent unIntent = new Intent(MainActivity.this, Sender.class);
                Bundle unBundle = new Bundle();

                unBundle.putString(NOMBRE, nombre);
                unBundle.putString(APELLIDO, apellido);
                unBundle.putString(EDAD, edad);

                unIntent.putExtras(unBundle);
                startActivity(unIntent);


            }
        });
    }
}
