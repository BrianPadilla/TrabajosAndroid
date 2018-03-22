package com.example.cabo.webservice;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Cabo on 21/03/2018.
 */

public class Mensaje {
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCodMensaje() {
        return codMensaje;
    }

    public void setCodMensaje(String codMensaje) {
        this.codMensaje = codMensaje;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @SerializedName("Mensaje")
    private String mensaje;

    @SerializedName("CodMensaje")
    private String codMensaje;

    @SerializedName("Metodo")
    private String metodo;


}
