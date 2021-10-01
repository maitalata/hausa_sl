package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Banana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana);
    }

    public void openTomato(View view){
        Intent intent = new Intent(this, Tomato.class);
        startActivity(intent);
    }

    public void openOrange(View view){
        Intent intent = new Intent(this, Orange.class);
        startActivity(intent);
    }

}