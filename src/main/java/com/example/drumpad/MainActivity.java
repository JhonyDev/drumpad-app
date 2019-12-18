package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        sp = new SoundPool.Builder()
                .setMaxStreams(6)
                .setAudioAttributes(audioAttributes)
                .build();


        sound1 = sp.load(getApplicationContext(),R.raw.drumsnd,1);
        sound2 = sp.load(getApplicationContext(),R.raw.drum1,1);
        sound3 = sp.load(getApplicationContext(),R.raw.drum2,1);
        sound4 = sp.load(getApplicationContext(),R.raw.recording2,1);
        sound5 = sp.load(getApplicationContext(),R.raw.recording,1);


    }

    public void playsound1 (View v){
        sp.play(sound1,1.0f,1.0f,0,0,1f);
    }
    public void playsound2 (View v){
        sp.play(sound2,1.0f,1.0f,0,0,1f);
    }
    public void playsound3 (View v) { sp.play(sound3,1.0f,1.0f,0,0,1f); }
    public void playsound4 (View v){
        sp.play(sound4,1.0f,1.0f,0,0,1f);
    }
    public void playsound5 (View v){
        sp.play(sound5,1.0f,1.0f,0,0,1f);
    }

}
