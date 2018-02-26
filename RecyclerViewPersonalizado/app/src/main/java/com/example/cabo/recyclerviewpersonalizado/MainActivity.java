package com.example.cabo.recyclerviewpersonalizado;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CardView card;
    //a list to store all the products
    List<Canciones> cancionesList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        cancionesList = new ArrayList<>();


        //adding some items to our list
        cancionesList.add(
                new Canciones(
                        1,
                        "ROCK",
                        "Un género muy conocido",
                        R.drawable.rock,
                        Color.YELLOW));

        cancionesList.add(
                new Canciones(
                        1,
                        "POP",
                        "Tiene tonadas para bailar",
                        R.drawable.pop,
                        Color.CYAN));

        cancionesList.add(
                new Canciones(
                        1,
                        "Alternativo",
                        "Para todo gusto",
                        R.drawable.alternativo,
                        Color.GREEN));

        cancionesList.add(
                new Canciones(
                        1,
                        "Instrumental",
                        "Es sin lírica",
                        R.drawable.instrumental,
                        Color.DKGRAY));

        cancionesList.add(
                new Canciones(
                        1,
                        "Instrumental",
                        "Es sin lírica",
                        R.drawable.instrumental,
                        Color.DKGRAY));

        cancionesList.add(
                new Canciones(
                        1,
                        "Instrumental",
                        "Es sin lírica",
                        R.drawable.instrumental,
                        Color.DKGRAY));


        //creating recyclerview adapter
        Adaptador adapter = new Adaptador(this, cancionesList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
