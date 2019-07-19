package com.iss.flaporfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String EXERSICE_WEIGHT = "Weight Lifting";
    public static final String EXERSICE_YOGA = "Yoga";
    public static final String EXERSICE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weight_lift = findViewById(R.id.weight_lift);
        RelativeLayout yoga = findViewById(R.id.yoga);
        RelativeLayout cardio = findViewById(R.id.cardio);

        weight_lift.setOnClickListener(this);
        yoga.setOnClickListener(this);
        cardio.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
       switch (view.getId()) {
           case R.id.weight_lift:
              loadDetailsActivity(MainActivity.EXERSICE_WEIGHT);
               break;
           case R.id.cardio:
               loadDetailsActivity(MainActivity.EXERSICE_CARDIO);
               break;
           case R.id.yoga:
               loadDetailsActivity(MainActivity.EXERSICE_YOGA);
               break;
        }

    }

    private void loadDetailsActivity(String exerciseTitle) {
        Intent intent = new Intent(MainActivity.this, LiftActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }
}
