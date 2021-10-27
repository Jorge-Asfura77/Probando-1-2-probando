package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView lblresultado = (TextView) findViewById(R.id.lblresultado);

        String resultado = getIntent().getStringExtra("res");

        if (resultado=="0")
        {
            lblresultado.setText(0);
        }
        else
        {
            lblresultado.setText("La respuesta es: " + resultado);
        }

    }
}