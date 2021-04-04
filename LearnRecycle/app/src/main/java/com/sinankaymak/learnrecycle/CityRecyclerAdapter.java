package com.sinankaymak.learnrecycle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CityRecyclerAdapter extends RecyclerView.Adapter<CityRecyclerAdapter.MyViewHolder> {

    private ArrayList<City> cities;
    private RecyclerViewClickListener listener;



    public CityRecyclerAdapter(ArrayList<City> cities,RecyclerViewClickListener listener) {
        this.cities = cities;
        this.listener=listener;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //which layout
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.city_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textPlace.setText(cities.get(position).getPlaceName());
        holder.imgPlace.setImageResource(cities.get(position).getPicName());




    }

    @Override
    public int getItemCount() {
        return cities.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    //Holder
     public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
         TextView textPlace;
         ImageView imgPlace;
         public MyViewHolder(@NonNull View itemView) {
             super(itemView);
             textPlace=itemView.findViewById(R.id.textView);
             imgPlace=itemView.findViewById(R.id.imageView);
             itemView.setOnClickListener(this);


         }

        @Override
        public void onClick(View v) {
             listener.onClick(v,getAdapterPosition());

        }
    }
}
