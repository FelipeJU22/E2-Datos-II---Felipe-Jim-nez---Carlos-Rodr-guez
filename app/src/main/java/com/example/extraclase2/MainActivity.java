package com.example.extraclase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mensaje;
    EditText frase1;
    EditText frase2;
    public void pressButton(View view){
        Log.i("Info", "Botón presionado");
        frase1 = findViewById(R.id.frase1);
        frase2 = findViewById(R.id.frase2);
        String mensajeUnido = frase1.getText().toString() + frase2.getText().toString();
        mensaje.setText(mensajeUnido);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = findViewById(R.id.mensaje);
        mensaje.setText("Frases concatenadas");
    }
}