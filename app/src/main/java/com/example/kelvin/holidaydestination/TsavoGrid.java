package com.example.kelvin.holidaydestination;




import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TsavoGrid extends AppCompatActivity {
    List<Hero> heroList;

    //the listview
    android.widget.GridView tsavo;



//    android.widget.GridView gridView;
//
//    String letterList[] ={"a,b,c,d,e,"};

//    int lettersicon[] = {R.drawable.lake,R.drawable.ken,R.drawable.lake,R.drawable.masai,R.drawable.rate};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsavo_grid);
        //initializing objects
        heroList = new ArrayList<>();
        tsavo = findViewById(R.id.Nanyuki);

        //adding some values to our list
        heroList.add(new Hero(R.drawable.tsavo_a, "", ""));
        heroList.add(new Hero(R.drawable.tsavo_b, "", ""));
        heroList.add(new Hero(R.drawable.tsavo_c, "", ""));
        heroList.add(new Hero(R.drawable.tsavo_k, "", ""));
        heroList.add(new Hero(R.drawable.tsavo, "", ""));
        heroList.add(new Hero(R.drawable.tsavo_w, "", ""));
        heroList.add(new Hero(R.drawable.tsavo_x, "", ""));
        heroList.add(new Hero(R.drawable.tsavo_y, "", ""));


        //creating the adapter
        TsavoGridAdapter adapter = new TsavoGridAdapter(this, R.layout.activity_custom_grid, heroList);

        //attaching adapter to the grid
        tsavo.setAdapter(adapter);
        tsavo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    //intent for first item
                    Intent grid = new Intent(getApplicationContext(),TsavoGrid.class);
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




