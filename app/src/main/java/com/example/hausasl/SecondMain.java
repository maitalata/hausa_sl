package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
    }

    public void openCamera(View view){
        Intent intent = new Intent(this, ClassifierActivity.class);
        startActivity(intent);
    }

    public void startColorsActivity(View view){
        Intent intent = new Intent(this, WhiteColor.class);
        startActivity(intent);
    }

    public void startFoods(View view){
        Intent intent = new Intent(this, Pepper.class);
        startActivity(intent);
    }

    public void startEnvironment(View view){
        Intent intent = new Intent(this, Summer.class);
        startActivity(intent);
    }

    public void openActions(View view){
        Intent intent = new Intent(this, Action.class);
        startActivity(intent);
    }

    public void openAbout(View view){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

}