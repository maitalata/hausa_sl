package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThingsMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_main);
    }

    public void startLionActivity(View view){
        Intent intent = new Intent(this, Lion.class);
        startActivity(intent);
    }

    public void startDoorActivity(View view){
        Intent intent = new Intent(this, Door.class);
        startActivity(intent);
    }

    public void startClassroomThings(View view){
        Intent intent = new Intent(this, Table.class);
        startActivity(intent);
    }

}