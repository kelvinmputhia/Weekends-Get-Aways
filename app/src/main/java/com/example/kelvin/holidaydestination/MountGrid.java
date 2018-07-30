
package com.example.kelvin.holidaydestination;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

public class MountGrid extends AppCompatActivity {
    List<Hero> heroList;

    //the listview
    android.widget.GridView kenya;



//    android.widget.GridView gridView;
//
//    String letterList[] ={"a,b,c,d,e,"};

//    int lettersicon[] = {R.drawable.lake,R.drawable.ken,R.drawable.lake,R.drawable.masai,R.drawable.rate};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mount_grid);
        //initializing objects
        heroList = new ArrayList<>();
        kenya = findViewById(R.id.Kenya);

        //adding some values to our list
        heroList.add(new Hero(R.drawable.mount_b, "", ""));
        heroList.add(new Hero(R.drawable.mount_h, "", ""));
        heroList.add(new Hero(R.drawable.mount_l, "", ""));
        heroList.add(new Hero(R.drawable.mount_s, "", ""));
        heroList.add(new Hero(R.drawable.mout_f, "", ""));
        heroList.add(new Hero(R.drawable.mount_z, "", ""));
        heroList.add(new Hero(R.drawable.mount_k, "", ""));

        heroList.add(new Hero(R.drawable.mount_o, "", ""));

        //creating the adapter
        MountGridAdapter adapter = new MountGridAdapter(this, R.layout.activity_custom_grid, heroList);

        //attaching adapter to the grid
        kenya.setAdapter(adapter);
        kenya.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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


