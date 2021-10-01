package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class SuperKitty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_kitty);
        VideoView view = (VideoView)findViewById(R.id.superkitty);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.labarin_sarki;
        view.setVideoURI(Uri.parse(path));
        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(view);
        view.setMediaController(mediaController);
        view.start();
    }
}