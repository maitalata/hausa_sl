package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HaruffanHausa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haruffan_hausa);
    }

    public void startHaruffa(View view){
        Intent intent = new Intent(this, AlphabetA.class);
        startActivity(intent);
    }

    public void startMasuGoyo(View view){
        Intent intent = new Intent(this, AlphabetSh.class);
        startActivity(intent);
    }

    public void startGwagware(View view){
        Intent intent = new Intent(this, AlphabetKa.class);
        startActivity(intent);
    }
}