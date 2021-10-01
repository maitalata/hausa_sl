package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BlueColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_color);
    }

    public void openRed(View view){
        Intent intent = new Intent(this, RedColor.class);
        startActivity(intent);
    }

    public void openGreen(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}