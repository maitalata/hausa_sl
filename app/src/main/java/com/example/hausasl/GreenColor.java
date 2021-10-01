package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GreenColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_color);
    }

    public void openBlue(View view){
        Intent intent = new Intent(this, BlueColor.class);
        startActivity(intent);
    }

    public void opneWhitw(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}