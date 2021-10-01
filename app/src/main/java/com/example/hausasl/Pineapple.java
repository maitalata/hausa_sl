package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pineapple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pineapple);
    }

    public void openOrange(View view){
        Intent intent = new Intent(this, Orange.class);
        startActivity(intent);
    }

    public void openCoconut(View view){
        Intent intent = new Intent(this, Coconut.class);
        startActivity(intent);
    }

}