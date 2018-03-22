package com.example.cabo.webservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity implements Response.ErrorListener, Response.Listener<String>{
    EditText mnumero;
    Button menviar;
    TextView mmensaje,mcodigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mnumero = findViewById(R.id.numero);
        menviar = findViewById(R.id.envia);
        mmensaje = findViewById(R.id.mensaje);
        mcodigo = findViewById(R.id.codigo);

        menviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviaNumero();
            }
        });
    }

    private void enviaNumero(){
        EnviaMensaje enviaMensaje = new EnviaMensaje(mnumero.getText().toString());
        Request<?> request = enviaMensaje.getRequest(this,this);
        AppController.getInstance().addToRequestQueue(request);
    }


    @Override
    public void onErrorResponse(VolleyError error) {
        Log.e("Error Response", error.getMessage());
    }

    @Override
    public void onResponse(String response) {
        GsonBuilder builder = new GsonBuilder();
        builder.setExclusionStrategies(new DefaultExclusionStrategy());
        Gson gson = builder.create();

        Mensaje modelo = gson.fromJson(response,Mensaje.class);

        mmensaje.setText("Mensaje: "+ modelo.getMensaje());
        mcodigo.setText("Código"+ modelo.getCodMensaje()+"--Metodo"+modelo.getMetodo());

    }
}
