package com.example.cabo.animacionxml;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.mimiga);
    }

    public void onButtonClick(View v) {
        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.izqder);

        imageView.startAnimation(animation);

    }

    public void onButtonClick2(View v){
        MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.town);
        mp.start();
    }

    public void onButtonClick3(View v){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.brinca);
        imageView.startAnimation(animation);
    }

    public void onButtonClick4(View v){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.parpadea);


        imageView.startAnimation(animation);
    }
}
