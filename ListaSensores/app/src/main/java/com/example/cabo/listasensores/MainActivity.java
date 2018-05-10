package com.example.cabo.listasensores;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    RecyclerView recyclerView;

    Adaptador adapter;
    ArrayList<Sensores> list;


    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> lista = sensorManager.getSensorList(Sensor.TYPE_ALL);

        list = new ArrayList<>();

        for(int i=1; i<lista.size(); i++) {

            list.add(new Sensores("Sensor: " + lista.get(i).getName(),
                    "Fabricante: " + lista.get(i).getVendor(),
                    "Version: " + lista.get(i).getVersion(),
                    "Distancia: " + lista.get(i).getMaximumRange(),
                    "Retraso: " + lista.get(i).getMinDelay(),
                    "Energía: " + lista.get(i).getPower()));
        }

        adapter = new Adaptador(list,this);
        recyclerView.setAdapter(adapter);


    }
}
