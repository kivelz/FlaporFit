package com.iss.flaporfit;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LiftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lift);

        TextView viewText = findViewById(R.id.exersiceTitle);
        ImageView image = findViewById(R.id.exersiceImage);
        LinearLayout mainBg = findViewById(R.id.main_background);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);

        viewText.setText(exerciseTitle);

        if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERSICE_WEIGHT)){
            image.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERSICE_YOGA)){
            image.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            image.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#52ad56"));
        }


    }
}
