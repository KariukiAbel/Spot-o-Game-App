package com.nabesh.spotongameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class SpotOn extends AppCompatActivity {
    private SpotOnView view; //displays and manages the game

    //called when this activity is first created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a new SpotOnView and add it to the RelativeLayout
        RelativeLayout layout = findViewById(R.layout.relativeLayout);
        view = new SpotOnView(this, getPreferences(Context.MODE_PRIVATE), layout);
        layout.addView(view, 0); //add view to layout
    }

    //called when this activity moves to the background
    @Override
    protected void onPause() {
        super.onPause();
        view.pause(); //release resources held by view
    }

    //called when this activity is brought to the foreground
    @Override
    protected void onResume() {
        super.onResume();
        view.resume(this); //Re-initialize the resources released onPause
    }
}
