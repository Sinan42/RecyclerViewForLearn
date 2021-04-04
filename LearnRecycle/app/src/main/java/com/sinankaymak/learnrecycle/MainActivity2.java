package com.sinankaymak.learnrecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listView);
        ArrayList<String> museums=new ArrayList<>();
        ArrayList<String> mosques=new ArrayList<>();
        Intent intent = getIntent();
        String info = intent.getStringExtra("info");
        mosques.add("Sultan Ahmet Mosque");
        mosques.add("Fatih Mosque");
        museums.add("Modern İstanbul");
        museums.add("Topkapı Palace Museum");
        museums.add("Archeology Museum");
        museums.add("Museum of Islamic Arts");

        if(info.matches("museum")) {
            ArrayAdapter adapter = new ArrayAdapter(MainActivity2.this, android.R.layout.simple_list_item_1, museums);
            listView.setAdapter(adapter);
            //You can add more options. İt is just an example
        }
        if(info.matches("mosques")){
            ArrayAdapter adapter = new ArrayAdapter(MainActivity2.this, android.R.layout.simple_list_item_1,mosques);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    //just an example for intent and ListView,you can add more options

                        Intent i = new Intent(MainActivity2.this,MainActivity.class);
                        startActivity(i);



                }
            });

        }

    }
}