package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlphabetK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_k);
    }

    public void openJ(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openL(View view){
        Intent intent = new Intent(this, AlphabetL.class);
        startActivity(intent);
    }

}