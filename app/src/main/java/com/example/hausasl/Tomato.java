package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tomato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);
    }

    public void openOnion(View view){
        Intent intent = new Intent(this, Onion.class);
        startActivity(intent);
    }

    public void openBanana(View view){
        Intent intent = new Intent(this, Banana.class);
        startActivity(intent);
    }

}