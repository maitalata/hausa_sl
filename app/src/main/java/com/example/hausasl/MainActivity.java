package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startHaruffa(View view){
        Intent intent = new Intent(this, HaruffanHausa.class);
        startActivity(intent);
    }

    public void startColorsActivity(View view){
        Intent intent = new Intent(this, WhiteColor.class);
        startActivity(intent);
    }

    public void startShortStoriesActivity(View view){
        Intent intent = new Intent(this, ShortStories.class);
        startActivity(intent);
    }

    public void startThingsActivity(View view){
        Intent intent = new Intent(this, ThingsMain.class);
        startActivity(intent);
    }

    public void openFirstQuiz(View view){
        Intent intent = new Intent(this, FirstQuiz.class);
        startActivity(intent);
    }

    public void openCamera(View view){
        Intent intent = new Intent(this, ClassifierActivity.class);
        startActivity(intent);
    }


    public void startCalenderMain(View view){
        Intent intent = new Intent(this, CalendarMain.class);
        startActivity(intent);
    }

    public void startSecondMain(View view){
        Intent intent = new Intent(this, SecondMain.class);
        startActivity(intent);
    }

    public void startArithmeticMain(View view){
        Intent intent = new Intent(this, ArithmeticMAIN.class);
        startActivity(intent);
    }

    public void startGreetings(View view){
        Intent intent = new Intent(this, GoodMorning.class);
        startActivity(intent);
    }


}