package com.example.cabo.listasensores;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.SensorViewHolder>{

    ArrayList<Sensores> list;
    Context context;

    public Adaptador(ArrayList<Sensores> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public SensorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.contenido,null);
        return new SensorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SensorViewHolder holder, int position) {
        final Sensores sensor = list.get(position);
        holder.nombre.setText(sensor.getNombre());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class SensorViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView nombre;

        public SensorViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textView_nombre);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            LayoutInflater li = LayoutInflater.from(context);
            View promptsView = li.inflate(R.layout.lista, null);

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    context);

            Sensores sensor = list.get(getAdapterPosition());

            TextView fabricante,version,rango,delay,power;

            fabricante = promptsView.findViewById(R.id.txt1);
            version = promptsView.findViewById(R.id.txt2);

            rango = promptsView.findViewById(R.id.txt3);
            delay = promptsView.findViewById(R.id.txt4);
            power = promptsView.findViewById(R.id.txt5);

            fabricante.setText(sensor.getFabricante());
            version.setText(sensor.getVersion());
            rango.setText(sensor.getRango());
            delay.setText(sensor.getDelay());
            power.setText(sensor.getPower());
            alertDialogBuilder.setView(promptsView);

            // set dialog message
            alertDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("Cerrar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    dialog.cancel();
                                }
                            });


            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

    }

}

