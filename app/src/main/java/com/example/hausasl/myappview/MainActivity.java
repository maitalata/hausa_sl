package com.example.hausasl.myappview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hausasl.ClassifierActivity;
import com.example.hausasl.R;

public class MainActivity extends AppCompatActivity {

    Button button_image_to_text;
    Button button_about_us;
    Button button_text_to_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}
