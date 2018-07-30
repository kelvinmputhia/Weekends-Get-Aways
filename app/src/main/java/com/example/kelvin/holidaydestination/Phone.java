package com.example.kelvin.holidaydestination;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Phone extends AppCompatActivity {
    Button dial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        dial=findViewById(R.id.Dial);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kk = new Intent(Intent.ACTION_DIAL);
                kk.setData(Uri.parse("tel:+2540723006118"));
                startActivity(kk);
            }
        });
    }
}
