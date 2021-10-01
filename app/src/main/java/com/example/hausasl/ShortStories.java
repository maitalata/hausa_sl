package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShortStories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_stories);
    }


    public void startLionAndRat(View view){
        Intent intent = new Intent(this, LionAndRat.class);
        startActivity(intent);
    }

    public void startSuperKitty(View view){
        Intent intent = new Intent(this, SuperKitty.class);
        startActivity(intent);
    }

    public void startHungryCaterpiller(View view){
        Intent intent = new Intent(this, HungryCaterpiller.class);
        startActivity(intent);
    }

    public void startDreamBig(View view){
        Intent intent = new Intent(this, DreamBig.class);
        startActivity(intent);
    }

}