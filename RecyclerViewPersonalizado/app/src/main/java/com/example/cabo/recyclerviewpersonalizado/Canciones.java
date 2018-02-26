package com.example.cabo.recyclerviewpersonalizado;

/**
 * Created by Belal on 10/18/2017.
 */


public class Canciones {
    private int id;
    private String title;
    private String shortdesc;
    private int image;
    private int card;

    public Canciones(int id, String title, String shortdesc, int image, int card) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.image = image;
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }


    public int getImage() {
        return image;
    }

    public int getCardView(){
        return card;
    }
}

