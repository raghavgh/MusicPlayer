package com.example.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button play,pause;
         mediaPlayer = MediaPlayer.create(this,R.raw.tere);
         play = findViewById(R.id.play);
         pause = findViewById(R.id.pause);
         play.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                mediaPlayer.start();
             }
         });
         pause.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 mediaPlayer.pause();
             }
         });
    }
}
