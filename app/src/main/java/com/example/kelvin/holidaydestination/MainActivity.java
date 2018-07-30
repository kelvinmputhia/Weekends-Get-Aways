package com.example.kelvin.holidaydestination;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity


        implements NavigationView.OnNavigationItemSelectedListener {
    public static TextView data;
    //a List of type hero for holding list items
    List<Hero> heroList;

    //the listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.list);

        //adding some values to our list
        heroList.add(new Hero(R.drawable.naiv, "", "Naivasha"));
        heroList.add(new Hero(R.drawable.masai, "", "Masai Mara"));
        heroList.add(new Hero(R.drawable.mombasa, "", "Mombasa"));
        heroList.add(new Hero(R.drawable.nanyuk, "", "Nanyuki"));
        heroList.add(new Hero(R.drawable.tsavo, "", "Tsavo"));
        heroList.add(new Hero(R.drawable.lake, "", "Lake Victoria"));
        heroList.add(new Hero(R.drawable.mount, "", "Mount Kenya"));

        //creating the adapter
        MyListAdapter adapter = new MyListAdapter(this, R.layout.activity_custom_list, heroList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    //intent for first item
                    Intent grid = new Intent(getApplicationContext(),GridView.class);
                    startActivity(grid);
                }else if (i==1){
                    //intent for second item
                    Intent masai = new Intent(getApplicationContext(),MasaiGrid.class);
                    startActivity(masai);
                }else if (i==2){
                    //
                    Intent coast = new Intent(getApplicationContext(),Mombasa.class);
                    startActivity(coast);
                }else if (i==3){
                    //

                    Intent coast = new Intent(getApplicationContext(),NanyukiGrid.class);
                    startActivity(coast);
                }else if (i==4){
                    //

                    Intent coast = new Intent(getApplicationContext(),TsavoGrid.class);
                    startActivity(coast);
                }else if (i==5){
                    //

                    Intent coast = new Intent(getApplicationContext(),LakeVictoria.class);
                    startActivity(coast);
                }else if (i==6){
                    //

                    Intent coast = new Intent(getApplicationContext(),MountGrid.class);
                    startActivity(coast);
                }else if (i==7){

                }
            }
        });




    }






    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent set = new Intent(getApplicationContext(),SettingsActivity.class);
            startActivity(set);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            Intent home = new Intent(getApplicationContext(),FetchDataOne.class);
            startActivity(home);
        } else if (id == R.id.nav_gallery) {
            Intent kk = new Intent(Intent.ACTION_DIAL);
            kk.setData(Uri.parse("tel:+2540723006118"));
            startActivity(kk);



        } else if (id == R.id.nav_slideshow) {
            Intent set = new Intent(getApplicationContext(),SettingsActivity.class);
            startActivity(set);
            

        } else if (id == R.id.nav_manage) {
            Intent simtool =getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.stk" );
            if (simtool!=null){
                startActivity(simtool);
            }

        } else if (id == R.id.nav_share) {

            Intent share =new Intent(Intent.ACTION_SEND);
            share.setType("plain/text");
            startActivity(Intent.createChooser(share,"Contact Us"));

        } else if (id == R.id.nav_send) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "0714678999"));
            intent.putExtra("sms_body", "Niaje mzae");
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
