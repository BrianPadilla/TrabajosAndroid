package com.example.cabo.webservice;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/**
 * Created by Cabo on 21/03/2018.
 */

public class EnviaMensaje {
    private String numero;

    public EnviaMensaje(String numero){
        this.numero = numero;
    }

    public StringRequest getRequest(Response.Listener<String> responseListener, Response.ErrorListener errorListener){
        final HashMap<String,String> credenciales = new HashMap<>();
        credenciales.put("Num",numero);

        String url = "http://tutos.duvatec.com/developers/ws/numeros.php";
        StringRequest request = new StringRequest(Request.Method.POST,url, responseListener, errorListener){
            @Override
            public String getBodyContentType(){
                return "application/jason charset="+getParamsEncoding();
            }
            @Override
            public byte[] getBody(){
                try {
                    return new JSONObject(credenciales).toString().getBytes(getParamsEncoding());
                } catch (UnsupportedEncodingException e){

                }
                return null;
            }
        };

        request.setRetryPolicy(new LongTimeoutAndTryRetryPolicy(LongTimeoutAndTryRetryPolicy.RETRIES_PHONE_ISP));
        return request;
    }
}
