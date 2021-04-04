package com.sinankaymak.learnrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<City> cities;
    private RecyclerView recyclerView;
    private CityRecyclerAdapter cityRecyclerAdapter;
    private CityRecyclerAdapter.RecyclerViewClickListener listener;
    ArrayList<String> museums=new ArrayList<>();
    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSettings();
        fillInTheArray();
        cityRecyclerAdapter.notifyDataSetChanged();

    }
    private void fillInTheArray(){
        cities.add(new City(R.drawable.museums,"Museums"));
        cities.add(new City(R.drawable.mosques,"Mosques"));
        cities.add(new City(R.drawable.churches,"Churches"));
        cities.add(new City(R.drawable.festivals,"Festivals"));
    }
    private void viewSettings() {
        setOnClickListener();
        recyclerView=findViewById(R.id.recyclerView);
        cities=new ArrayList<>();
        cityRecyclerAdapter=new CityRecyclerAdapter(cities,listener);
        recyclerView.setAdapter(cityRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
    private void setOnClickListener(){
        listener=new CityRecyclerAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {

                        if(position == 0) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                            intent.putExtra("info", "museum");
                            startActivity(intent);
                        }
                        if (position ==1){
                            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                            intent.putExtra("info", "mosques");
                            startActivity(intent);
                        }

                        }
                        //....You can add more options. if you want





        };
    }




}