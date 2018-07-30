package com.example.kelvin.holidaydestination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread splash =new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent x=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(x);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splash.start();
    }
}

