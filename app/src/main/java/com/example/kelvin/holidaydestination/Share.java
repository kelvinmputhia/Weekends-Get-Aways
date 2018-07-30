package com.example.kelvin.holidaydestination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Share extends AppCompatActivity {
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        share=findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent share =new Intent(Intent.ACTION_SEND);
                share.setType("plain/text");
                startActivity(Intent.createChooser(share,"Contact Us"));
            }
        });
    }
}
