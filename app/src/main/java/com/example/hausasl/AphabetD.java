package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AphabetD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aphabet_d);
    }

    public void openC(View view){
        Intent intent = new Intent(this, AlphabetC.class);
        startActivity(intent);
    }

    public void openE(View view){
        Intent intent = new Intent(this, AlphabetE.class);
        startActivity(intent);
    }
}