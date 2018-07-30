
package com.example.kelvin.holidaydestination;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LakeVictoria extends AppCompatActivity {
    List<Hero> heroList;

    //the listview
    android.widget.GridView lake;



//    android.widget.GridView gridView;
//
//    String letterList[] ={"a,b,c,d,e,"};

//    int lettersicon[] = {R.drawable.lake,R.drawable.ken,R.drawable.lake,R.drawable.masai,R.drawable.rate};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lake_victoria);
        //initializing objects
        heroList = new ArrayList<>();
        lake = findViewById(R.id.lake);

        //adding some values to our list
        heroList.add(new Hero(R.drawable.lake, "", ""));
        heroList.add(new Hero(R.drawable.lakev_a, "", ""));
        heroList.add(new Hero(R.drawable.lake_x, "", ""));
        heroList.add(new Hero(R.drawable.lakev_e, "", ""));
        heroList.add(new Hero(R.drawable.lakev_y, "", ""));
        heroList.add(new Hero(R.drawable.lakev_b, "", ""));
        heroList.add(new Hero(R.drawable.lake_x, "", ""));
        heroList.add(new Hero(R.drawable.lakev_z, "", ""));

        //creating the adapter
        LakeVictoriaAdapter adapter = new LakeVictoriaAdapter(this, R.layout.activity_custom_grid, heroList);

        //attaching adapter to the grid
        lake.setAdapter(adapter);
        lake.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    //intent for first item
                    Intent grid = new Intent(getApplicationContext(),NanyukiGrid.class);
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


