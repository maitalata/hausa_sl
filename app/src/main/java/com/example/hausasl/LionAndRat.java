package com.example.hausasl;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class LionAndRat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lion_and_rat);
        VideoView view = (VideoView)findViewById(R.id.lionAndRatView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.rat_and_lion;
        view.setVideoURI(Uri.parse(path));
        MediaController mediaController = new
                MediaController(this);
        mediaController.setAnchorView(view);
        view.setMediaController(mediaController);
        view.start();
    }
}