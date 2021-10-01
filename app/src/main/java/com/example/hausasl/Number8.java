package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Number8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number8);
    }

    public void open7(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void open9(View view){
        Intent intent = new Intent(this, Number9.class);
        startActivity(intent);
    }

}