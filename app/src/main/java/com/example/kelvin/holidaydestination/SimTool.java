package com.example.kelvin.holidaydestination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SimTool extends AppCompatActivity {
    Button SimTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim_tool);
        SimTool=findViewById(R.id.SimTool);
        SimTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simtool =new Intent(getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.stk" ));
                if (simtool!=null){
                    startActivity(simtool);
                }
            }
        });
    }
}
