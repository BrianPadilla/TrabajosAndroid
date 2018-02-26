package com.example.cabo.recyclerviewbasico;

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
    List<Alumnos> alumnosList;

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
        alumnosList = new ArrayList<>();


        //adding some items to our list
        alumnosList.add(
                new Alumnos(
                        1,
                        "ARANDA PATRON NOMAR JAZIEL",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "CARDENAS RAMOS FRANCISCO EMANUEL",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "CASTILLO CORRALES VICTOR EMMANUEL",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "CERVANTES JIMÉNEZ JOSÉ MIGUEL",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "CORDERO RIVERA SELVA YAZMIN",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "CORDERO VILLA OSCAR ALBERTO",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "ESPINOSA ABANDO DENISSE YANETH",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "FIGUEROA CUETO JUAN RAMON",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "GALLEGOS GODINEZ FRANCISCO JAVIER",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "GIL LLANOS JUAN PEDRO",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "GONZALEZ ARELLANO ERNESTO",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "GUTIERREZ ESPARZA BRAYAN JESUS",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "GUTIÉRREZ ROJAS BRYAN",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "LOPEZ ALVARADO MISSAEL",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "MARTINEZ BAÑUELOS ERIKA LIZBETH",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "MENDEZ SANTANA KEVIN ALEJANDRO",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "MONROY SALCEDO JOSE DE JESUS",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "PADILLA SIMÓN BRIAN EFRÉN",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "PARRA DOMINGUEZ DYLAN SALVADOR",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "PEREZ ARAIZA FLOR MARIELA",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "PUGA FLORES CARLOS",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "REYES GODINEZ CARLA GUADALUPE",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "REYES GUERRERO GUILLERMO GUADALUPE",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "RICO ESPARZA HENRY",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "RIVERA RAMIREZ DAVID",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "SANCHEZ CARRILLO BETSY DEL CARMEN",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "SILVA CAMACHO EDUARDO LUIS",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "TORRES CUETO JESUS MANUEL",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "VALDEZ LOPEZ HOLLIVER EDUARDO",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "VALENZUELA MIRAMONTES JOSE PABLO",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));

        alumnosList.add(
                new Alumnos(
                        1,
                        "ZAMORANO ALCALÁ GUILLERMO",
                        "14400982",
                        "ISC",
                        R.drawable.contacto,
                        Color.WHITE));






        //creating recyclerview adapter
        Adaptador adapter = new Adaptador(this, alumnosList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
