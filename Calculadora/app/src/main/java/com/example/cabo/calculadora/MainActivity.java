package com.example.cabo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText barra;
    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,botonigual,botonsuma,botonresta,botonmulti,botondivision,b0,botonclear;


    public double valor1;
    public double valor2;
    public double resultado;
    public int operando;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barra=(EditText)findViewById(R.id.barrab);
        b0 = (Button)findViewById(R.id.btn0);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        b3 = (Button)findViewById(R.id.btn3);
        b4 = (Button)findViewById(R.id.btn4);
        b5 = (Button)findViewById(R.id.btn5);
        b6 = (Button)findViewById(R.id.btn6);
        b7 = (Button)findViewById(R.id.btn7);
        b8 = (Button)findViewById(R.id.btn8);
        b9 = (Button)findViewById(R.id.btn9);
        botonclear = (Button)findViewById(R.id.btnC);
        botonsuma = (Button)findViewById(R.id.btnsuma);
        botonresta = (Button)findViewById(R.id.btnresta);
        botonmulti = (Button)findViewById(R.id.btnmulti);
        botondivision = (Button)findViewById(R.id.btndivision);
        botonigual = (Button)findViewById(R.id.btnigual);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton1();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton2();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton3();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton4();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton5();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton6();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton7();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton8();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton9();
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boton0();
            }
        });

        botonsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma();
            }
        });



        botonresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resta();
            }
        });

        botonmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplicacion();
            }
        });

        botondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });

        botonigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                igual();
            }
        });

        botonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barra.setText("");
                valor1=0;
                valor2=0;
                resultado = 0;
            }
        });


        }


    public void boton0(){
        String cadena = barra.getText().toString();
        cadena = cadena+"0";
        barra.setText(cadena);
    }

    public void boton1(){
        String cadena = barra.getText().toString();
        cadena = cadena+"1";
        barra.setText(cadena);
    }

    public void boton2(){
        String cadena = barra.getText().toString();
        cadena = cadena+"2";
        barra.setText(cadena);
    }

    public void boton3(){
        String cadena = barra.getText().toString();
        cadena = cadena+"3";
        barra.setText(cadena);
    }

    public void boton4(){
        String cadena = barra.getText().toString();
        cadena = cadena+"4";
        barra.setText(cadena);
    }

    public void boton5(){
        String cadena = barra.getText().toString();
        cadena = cadena+"5";
        barra.setText(cadena);
    }

    public void boton6(){
        String cadena = barra.getText().toString();
        cadena = cadena+"6";
        barra.setText(cadena);
    }

    public void boton7(){
        String cadena = barra.getText().toString();
        cadena = cadena+"7";
        barra.setText(cadena);
    }

    public void boton8(){
        String cadena = barra.getText().toString();
        cadena = cadena+"8";
        barra.setText(cadena);
    }

    public void boton9(){
        String cadena = barra.getText().toString();
        cadena = cadena+"9";
        barra.setText(cadena);
    }

    public void botonpunto(){
        String cadena = barra.getText().toString();
        cadena = cadena+".";
        barra.setText(cadena);
    }

    public void suma(){
            String aux = barra.getText().toString();
            valor1 = Double.parseDouble(aux);
            barra.setText("");
            operando = 1;

    }

    public void resta(){

            String aux = barra.getText().toString();
            valor1 = Double.parseDouble(aux);

            barra.setText("");
            operando = 2;

    }

    public void multiplicacion(){

            String aux = barra.getText().toString();
            valor1 = Double.parseDouble(aux);

            barra.setText("");
            operando = 3;

    }

    public void division(){

            String aux = barra.getText().toString();
            valor1 = Double.parseDouble(aux);

            barra.setText("");
            operando = 4;

    }

    public void igual(){

            String aux1 = barra.getText().toString();
            valor2 = Double.parseDouble(aux1);

            barra.setText("");
            if(operando == 1){
                resultado = valor1 + valor2;
            } else if (operando == 2){
                resultado = valor1 - valor2;
            } else if (operando == 3){
                resultado = valor1 * valor2;
            } else if (operando == 4){
                resultado = valor1 / valor2;
            }
            barra.setText(resultado+"");
        }
    }


