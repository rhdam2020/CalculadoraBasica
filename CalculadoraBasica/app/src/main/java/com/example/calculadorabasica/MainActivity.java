package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numero1, numero2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = findViewById(R.id.etOperador1);
        numero2 = findViewById(R.id.etOperador2);
        resultado = findViewById(R.id.etResultado);
    }
    public void btnSuma_click(View vista){
        if (!numero1.getText().toString().trim().equals("") && !numero2.getText().toString().trim().equals("")){
               int operador1 = Integer.parseInt(numero1.getText().toString().trim()) ;
               int operador2 = Integer.parseInt(numero2.getText().toString().trim()) ;
               int resultadoSuma= operador1+operador2;
               resultado.setText(String.valueOf(resultadoSuma));
        }else{
            Toast toast=Toast.makeText(getApplicationContext(),"Rellena los campos de texto", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
    public void btnResta_click(View vista){
        if (!numero1.getText().toString().trim().equals("") && !numero2.getText().toString().trim().equals("")){
            int operador1 = Integer.parseInt(numero1.getText().toString().trim()) ;
            int operador2 = Integer.parseInt(numero2.getText().toString().trim()) ;
            int elResultado=operador1-operador2;
            resultado.setText(String.valueOf(elResultado));
        }else{
            Toast toast=Toast.makeText(getApplicationContext(),"Rellena los campos de texto", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
    public void btnProducto_click(View vista){
        if (!numero1.getText().toString().trim().equals("") && !numero2.getText().toString().trim().equals("")){
            int operador1 = Integer.parseInt(numero1.getText().toString().trim()) ;
            int operador2 = Integer.parseInt(numero2.getText().toString().trim()) ;
            int elResultado=operador1*operador2;
            resultado.setText(String.valueOf(elResultado));
        }else{
            Toast toast=Toast.makeText(getApplicationContext(),"Rellena los campos de texto", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
    public void btnDivision_click(View vista){
        if (!numero1.getText().toString().trim().equals("") && !numero2.getText().toString().trim().equals("")){
            int operador1 = Integer.parseInt(numero1.getText().toString().trim()) ;
            int operador2 = Integer.parseInt(numero2.getText().toString().trim()) ;
            if (operador2 == 0) {
                Toast toast=Toast.makeText(getApplicationContext(),"No se puede dividir por cero", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }else{
                int elResultado=operador1/operador2;
                resultado.setText(String.valueOf(elResultado));
            }
        }else{
            Toast toast=Toast.makeText(getApplicationContext(),"Rellena los campos de texto", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

    }
}