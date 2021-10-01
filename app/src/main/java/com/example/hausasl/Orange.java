package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Orange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange);
    }

    public void openBanana(View view){
        Intent intent = new Intent(this, Banana.class);
        startActivity(intent);
    }

    public void openPineapple(View view){
        Intent intent = new Intent(this, Pineapple.class);
        startActivity(intent);
    }

}