package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RedColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_color);
    }

    public void openYellow(View view){
        Intent intent = new Intent(this, YellowColor.class);
        startActivity(intent);
    }

    public void openBlue(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}