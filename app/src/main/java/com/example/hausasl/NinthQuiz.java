package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class NinthQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_quiz);
    }

    public void openHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void correct(View view) {
        Toast toast = Toast.makeText(this, "Da Kyau " + ("\u2705"), Toast.LENGTH_SHORT);
        ViewGroup group = (ViewGroup) toast.getView();
        TextView messageTextView = (TextView) group.getChildAt(0);
        messageTextView.setTextSize(25);
        toast.show();
        Intent intent = new Intent(this, TenthQuiz.class);
        startActivity(intent);
        // Button playButton = (Button) findViewById(R.id.thirdQuizButton);
        // playButton.setVisibility(View.VISIBLE);
    }

    public void wrong(View view) {
        Toast toast = Toast.makeText(this, "Ba Dai Dai Bane " + ("\u274C"), Toast.LENGTH_SHORT);
        ViewGroup group = (ViewGroup) toast.getView();
        TextView messageTextView = (TextView) group.getChildAt(0);
        messageTextView.setTextSize(25);
        toast.show();
    }

}