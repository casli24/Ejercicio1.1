package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = (EditText) findViewById(R.id.n1);
        EditText num2 = (EditText) findViewById(R.id.n2);


        Button btn = (Button) findViewById(R.id.btnSum);

        txtR = (TextView) findViewById(R.id.txtR);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla = new Intent(getApplicationContext(), SecondActivity.class);
                Funciones funcion = new Funciones(
                        Integer.parseInt(num1.getText().toString()),
                        Integer.parseInt(num2.getText().toString())
                );
                Integer resultado = funcion.suma(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
                txtR.setText("La Suma es: " + resultado);
                pantalla.putExtra("dato", txtR.getText().toString());
                startActivity(pantalla);
            }
        });

        Button btn1 = (Button) findViewById(R.id.btnRest);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(getApplicationContext(), SecondActivity.class);
                Funciones funcion = new Funciones(
                        Integer.parseInt(num1.getText().toString()),
                        Integer.parseInt(num2.getText().toString())
                );
                Integer resultado = funcion.resta(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
                txtR.setText("La Resta da: " + resultado);
                pantalla.putExtra("dato", txtR.getText().toString());
                startActivity(pantalla);
            }
        });


        Button btn2 = (Button) findViewById(R.id.btnMultiplicar);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(getApplicationContext(), SecondActivity.class);
                Funciones funcion = new Funciones(
                        Integer.parseInt(num1.getText().toString()),
                        Integer.parseInt(num2.getText().toString())
                );
                Integer resultado = funcion.multiplicacion(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
                txtR.setText("La Multiplicación da: " + resultado);
                pantalla.putExtra("dato", txtR.getText().toString());
                startActivity(pantalla);
            }
        });


        Button btn3 = (Button) findViewById(R.id.btnDivision);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantalla = new Intent(getApplicationContext(), SecondActivity.class);
                Funciones funcion = new Funciones(
                        Integer.parseInt(num1.getText().toString()),
                        Integer.parseInt(num2.getText().toString())
                );
                Integer resultado = funcion.division(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
                txtR.setText("La División da: " + resultado);
                pantalla.putExtra("dato", txtR.getText().toString());
                startActivity(pantalla);
            }
        });
    }
}