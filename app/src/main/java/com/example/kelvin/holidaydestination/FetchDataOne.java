package com.example.kelvin.holidaydestination;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FetchDataOne extends AppCompatActivity {
    public static TextView data;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_data_one);
        dialog = new ProgressDialog(this);
        data=findViewById(R.id.fetchedata);
        fetchData process =new fetchData();
        process.execute();
        dialog.show();
    }
}