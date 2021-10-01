package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Number4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number4);
    }

    public void open3(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void open5(View view){
        Intent intent = new Intent(this, Number5.class);
        startActivity(intent);
    }

}