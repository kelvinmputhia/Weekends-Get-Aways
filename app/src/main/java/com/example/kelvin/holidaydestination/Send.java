package com.example.kelvin.holidaydestination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Send extends AppCompatActivity {
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        send=findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sms = new Intent(Intent.ACTION_MAIN);
                sms.setType("vnd.android-dir/mms-sms");
                startActivity(sms);
            }
        });
    }
}
