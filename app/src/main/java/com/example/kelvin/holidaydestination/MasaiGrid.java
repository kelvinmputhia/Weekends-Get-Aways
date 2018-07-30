package com.example.kelvin.holidaydestination;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MasaiGrid extends AppCompatActivity {
    List<Hero> heroList;

    //the listview
    android.widget.GridView masai;



//    android.widget.GridView gridView;
//
//    String letterList[] ={"a,b,c,d,e,"};

//    int lettersicon[] = {R.drawable.lake,R.drawable.ken,R.drawable.lake,R.drawable.masai,R.drawable.rate};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masai_grid);
        //initializing objects
        heroList = new ArrayList<>();
        masai = findViewById(R.id.MasaiGrid);

        //adding some values to our list
        heroList.add(new Hero(R.drawable.masa_a, "", ""));
        heroList.add(new Hero(R.drawable.masai_b, "", ""));
        heroList.add(new Hero(R.drawable.masai_d, "", ""));
        heroList.add(new Hero(R.drawable.masai_c, "", ""));
        heroList.add(new Hero(R.drawable.masai_f, "", ""));
        heroList.add(new Hero(R.drawable.masai_e, "", ""));
        heroList.add(new Hero(R.drawable.masai_j, "", ""));

        heroList.add(new Hero(R.drawable.masai_m, "", ""));


        //creating the adapter
        MasaiAdapter adapter = new MasaiAdapter(this, R.layout.activity_custom_grid, heroList);

        //attaching adapter to the grid
        masai.setAdapter(adapter);
        masai.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    //intent for first item
                    Intent grid = new Intent(getApplicationContext(),MasaiGrid.class);
                    startActivity(grid);
                }else if (i==1){
                    //intent for second item
                }
            }
        });








//        gridView = findViewById(R.id.GridView);
//        GridAdapter adapter =new GridAdapter(GridView.this,lettersicon,letterList);
//        gridView.setAdapter(adapter);
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(GridView.this, "Image Clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}


