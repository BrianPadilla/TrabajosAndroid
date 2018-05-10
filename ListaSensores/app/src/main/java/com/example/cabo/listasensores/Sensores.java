package com.example.cabo.listasensores;

import java.io.Serializable;

public class Sensores implements Serializable{
    private String nombre,fabricante,version,retraso,distancia,energía;

    public Sensores(String nombre, String fabricante, String version, String distancia, String retraso, String energía) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.version = version;
        this.distancia = distancia;
        this.retraso = retraso;
        this.energía = energía;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getVersion() {
        return version;
    }

    public String getDelay() {
        return retraso;
    }

    public String getRango() {
        return distancia;
    }

    public String getPower() {
        return energía;
    }
}
