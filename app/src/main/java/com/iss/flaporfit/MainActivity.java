package com.iss.flaporfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
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
               Intent weightActivity = new Intent(MainActivity.this, LiftActivity.class);
               weightActivity.putExtra(MainActivity.EXTRA_ITEM_TITLE, "Weight Lifting");
               startActivity(weightActivity);
               break;
           case R.id.cardio:
               Intent cardioActivity = new Intent(MainActivity.this, CardioActivity.class);
               startActivity(cardioActivity);
               break;
           case R.id.yoga:
               Intent yogaActivity = new Intent(MainActivity.this, YogaActivity.class);
               startActivity(yogaActivity);
               break;
        }

    }
}
