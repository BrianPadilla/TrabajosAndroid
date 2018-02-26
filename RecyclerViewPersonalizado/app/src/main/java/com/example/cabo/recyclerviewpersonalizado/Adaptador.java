package com.example.cabo.recyclerviewpersonalizado;

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
    private List<Canciones> cancionesList;

    //getting the context and product list with constructor
    public Adaptador(Context mCtx, List<Canciones> cancionesList) {
        this.mCtx = mCtx;
        this.cancionesList = cancionesList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_lista, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the canciones of the specified position
        Canciones canciones = cancionesList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(canciones.getTitle());
        holder.textViewShortDesc.setText(canciones.getShortdesc());
        holder.cardView.setCardBackgroundColor(canciones.getCardView());


        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(canciones.getImage()));

    }


    @Override
    public int getItemCount() {
        return cancionesList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc;
        ImageView imageView;
        CardView cardView;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cd1);
        }
    }
}
