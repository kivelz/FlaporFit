package com.iss.flaporfit;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LiftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lift);

        TextView view = (TextView) findViewById(R.id.exersiceTitle);
        ImageView image = findViewById(R.id.exersiceImage);


    }
}
