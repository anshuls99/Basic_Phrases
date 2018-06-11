package com.example.anshulsharma.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mplayer;
    public void play(View view) {

        int id=view.getId();
        String ourId=view.getResources().getResourceEntryName(id);

        int rawId=getResources().getIdentifier(ourId,"raw","com.example.anshulsharma.basicphrases");
        mplayer=MediaPlayer.create(this,rawId);
        mplayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
