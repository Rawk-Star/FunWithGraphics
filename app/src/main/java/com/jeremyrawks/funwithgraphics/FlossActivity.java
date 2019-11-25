package com.jeremyrawks.funwithgraphics;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FlossActivity extends AppCompatActivity {

    Button mFlossButton;
    ImageView mFlossImageView;
    AnimationDrawable mFlossAnimation;
    MediaPlayer mMediaPlayer;
    boolean musicPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floss);
        mFlossButton = findViewById(R.id.flossButton);
        mFlossImageView = findViewById(R.id.flossImageView);

        // Assign animation sequence XML file as background of an ImageView widget
        mFlossImageView.setBackgroundResource(R.drawable.flossing_jeremy);
        mFlossAnimation = (AnimationDrawable) mFlossImageView.getBackground();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMediaPlayer = MediaPlayer.create(this, R.raw.bensound_dance);
        if (musicPlaying) {mMediaPlayer.start();}
    }

    @Override
    protected void onPause() {
        super.onPause();
        musicPlaying = mMediaPlayer.isPlaying();
        mMediaPlayer.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mMediaPlayer.stop();
        mMediaPlayer.release();
        mMediaPlayer = null;
    }

    // Starts and stops the animation
    public void onFlossClicked(View view) {

        if (mFlossAnimation.isRunning()) {
            mMediaPlayer.pause();
            mFlossAnimation.stop();
            mFlossButton.setText(R.string.floss_start_button);
        }
        else {
            mMediaPlayer.start();
            mFlossAnimation.start();
            mFlossButton.setText(R.string.floss_stop_button);
        }
    }
}