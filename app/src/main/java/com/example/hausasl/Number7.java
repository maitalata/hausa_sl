package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Number7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number7);
    }

    public void open6(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void open8(View view){
        Intent intent = new Intent(this, Number8.class);
        startActivity(intent);
    }

}