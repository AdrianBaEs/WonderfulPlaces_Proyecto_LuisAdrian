package com.luisadrian.wonderfulplaces;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by luisadrian on 8/23/16.
 */
public class WonderfulPlacesAdaptador extends RecyclerView.Adapter<WonderfulPlacesAdaptador.WonderfulPlacesViewHolder> {

    ArrayList<PlacePojo> lugares;
    Activity activity;

    public WonderfulPlacesAdaptador(ArrayList<PlacePojo> lugares, Activity activity) {
        this.lugares = lugares;
        this.activity = activity;
    }

    @Override
    public WonderfulPlacesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_place,parent,false);
        return new WonderfulPlacesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final WonderfulPlacesViewHolder holder, int position) {
        final PlacePojo lugarVisita=lugares.get(position);
        holder.ivPlace.setImageResource(lugarVisita.getImagenLugar());
        holder.tvNombreLugar.setText(lugarVisita.getNombreLugar());
        holder.tvCiudad.setText(lugarVisita.getUbicacionLugar());
        holder.tvDescripcionLugar.setText(lugarVisita.getDescripcionLugar());

        holder.cardItemRecycler.setOnClickListener(new CardView.OnClickListener(){
            public void onClick(View v){
                if(lugarVisita.getImagenLugar()==R.drawable.recurso_wp_iglesia_valladolid){
                    Intent irMapa=new Intent(activity,MapsActivity.class);
                    irMapa.putExtra("clave",1);
                    activity.startActivity(irMapa);
                }
                if(lugarVisita.getImagenLugar()==R.drawable.recurso_wp_centro_campeche){
                    Intent irMapa=new Intent(activity,MapsActivity.class);
                    irMapa.putExtra("clave",2);
                    activity.startActivity(irMapa);
                }
                if(lugarVisita.getImagenLugar()==R.drawable.recurso_wp_monumento_merida){
                    Intent irMapa=new Intent(activity,MapsActivity.class);
                    irMapa.putExtra("clave",3);
                    activity.startActivity(irMapa);
                }
                if(lugarVisita.getImagenLugar()==R.drawable.recurso_wp_museo_maya_merida){
                    Intent irMapa=new Intent(activity,MapsActivity.class);
                    irMapa.putExtra("clave",4);
                    activity.startActivity(irMapa);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return lugares.size();
    }

    public static class WonderfulPlacesViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPlace;
        TextView tvNombreLugar;
        TextView tvCiudad;
        TextView tvDescripcionLugar;
        CardView cardItemRecycler;

        public WonderfulPlacesViewHolder(View itemView) {
            super(itemView);

            ivPlace=(ImageView) itemView.findViewById(R.id.ivPlace);
            tvNombreLugar=(TextView) itemView.findViewById(R.id.tvNombreLugar);
            tvCiudad=(TextView) itemView.findViewById(R.id.tvCiudad);
            tvDescripcionLugar=(TextView) itemView.findViewById(R.id.tvDescripcionLugar);
            cardItemRecycler=(CardView) itemView.findViewById(R.id.cardItemRecycler);

        }
    }
}
