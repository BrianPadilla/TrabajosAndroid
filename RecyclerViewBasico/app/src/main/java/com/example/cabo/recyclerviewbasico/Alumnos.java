package com.example.cabo.recyclerviewbasico;

/**
 * Created by Belal on 10/18/2017.
 */


public class Alumnos {
    private int id;
    private String getnombre;
    private String getncontrol;
    private String getcarrera;
    private int image;
    private int card;

    public Alumnos(int id, String getnombre, String getncontrol, String getcarrera, int image, int card) {
        this.id = id;
        this.getnombre = getnombre;
        this.getncontrol = getncontrol;
        this.getcarrera = getcarrera;
        this.image = image;
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return getnombre;
    }

    public String getCarrera() {
        return getcarrera;
    }

    public String getGetncontrol(){
        return  getncontrol;
    }


    public int getImage() {
        return image;
    }

    public int getCardView(){
        return card;
    }
}

