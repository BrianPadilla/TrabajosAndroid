package com.example.cabo.recyclerviewbasico;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Belal on 10/18/2017.
 */


public class Adaptador extends RecyclerView.Adapter<Adaptador.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Alumnos> alumnosList;

    //getting the context and product list with constructor
    public Adaptador(Context mCtx, List<Alumnos> alumnosList) {
        this.mCtx = mCtx;
        this.alumnosList = alumnosList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.items, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the alumnos of the specified position
        Alumnos alumnos = alumnosList.get(position);

        //binding the data with the viewholder views
        holder.nombre.setText(alumnos.getNombre());
        holder.ncontrol.setText(alumnos.getGetncontrol());
        holder.carrera.setText(alumnos.getCarrera());
        holder.cardView.setCardBackgroundColor(alumnos.getCardView());


        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(alumnos.getImage()));

    }


    @Override
    public int getItemCount() {
        return alumnosList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView nombre, ncontrol, carrera;
        ImageView imageView;
        CardView cardView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            nombre = itemView.findViewById(R.id.Nombre);
            ncontrol = itemView.findViewById(R.id.NControl);
            carrera = itemView.findViewById(R.id.Carrera);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cd1);
        }
    }
}
