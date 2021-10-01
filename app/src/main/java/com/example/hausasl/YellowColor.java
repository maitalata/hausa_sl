package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class YellowColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_color);
    }

    public void openBrown(View view){
        Intent intent = new Intent(this, BrownColor.class);
        startActivity(intent);
    }

    public void openRed(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}