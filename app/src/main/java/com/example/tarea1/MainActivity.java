package com.example.tarea1;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtnum1 = (EditText) findViewById(R.id.txtnum1);
        EditText txtnum2 = (EditText) findViewById(R.id.txtnum2);

        Button btnsuma = (Button) findViewById(R.id.btnsuma);
        Button btnresta = (Button) findViewById(R.id.btnresta);
        Button btnmultiplicacion = (Button) findViewById(R.id.btnmultiplicacion);
        Button btndivision = (Button) findViewById(R.id.btndivision);


        /*Evento del Evento btnprueba*/
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtnum1.getText().toString().length() == 0 || txtnum2.getText().toString().length() == 0)
                {
                    makeText(getApplicationContext(), "Asegurate de llenar todos los campos", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intentresultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    Double resultado;
                    resultado = Double.parseDouble(txtnum1.getText().toString()) + Double.parseDouble(txtnum2.getText().toString());

                    intentresultado.putExtra("res", resultado.toString());

                    startActivity(intentresultado);
                }
            }
        });


        //Evento btnresta
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtnum1.getText().toString().length() == 0 || txtnum2.getText().toString().length() == 0)
                {
                    makeText(getApplicationContext(), "Asegurate de llenar todos los campos", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intentresultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    Double resultado;
                    resultado = Double.parseDouble(txtnum1.getText().toString()) - Double.parseDouble(txtnum2.getText().toString());

                    intentresultado.putExtra("res", resultado.toString());

                    startActivity(intentresultado);
                }
            }
        });

        //Evento btnmultiplicacion
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtnum1.getText().toString().length() == 0 || txtnum2.getText().toString().length() == 0)
                {
                    makeText(getApplicationContext(), "Asegurate de llenar todos los campos", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intentresultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    Double resultado;
                    resultado = Double.parseDouble(txtnum1.getText().toString()) * Double.parseDouble(txtnum2.getText().toString());

                    intentresultado.putExtra("res", resultado.toString());

                    startActivity(intentresultado);
                }
            }
        });

        //Evento btndivision
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtnum1.getText().toString().length() == 0 || txtnum2.getText().toString().length() == 0)
                {
                    makeText(getApplicationContext(), "Asegurate de llenar todos los campos", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intentresultado = new Intent(getApplicationContext(), ActivityResultado.class);
                    Double resultado;
                    resultado = Double.parseDouble(txtnum1.getText().toString()) / Double.parseDouble(txtnum2.getText().toString());

                    intentresultado.putExtra("res", resultado.toString());

                    startActivity(intentresultado);
                }
            }
        });
    }
}