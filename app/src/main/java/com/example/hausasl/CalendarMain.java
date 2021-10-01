package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalendarMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_main);
    }

    public void openMonth(View view){
        Intent intent = new Intent(this, January.class);
        startActivity(intent);
    }

    public void openOthers(View view){
        Intent intent = new Intent(this, Time.class);
        startActivity(intent);
    }


}