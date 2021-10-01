package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ArithmeticMAIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic_main);
    }

    public void openNumbers(View view){
        Intent intent = new Intent(this, Number1.class);
        startActivity(intent);
    }

    public void openArithmetic(View view){
        Intent intent = new Intent(this, OnePlusOne.class);
        startActivity(intent);
    }

}