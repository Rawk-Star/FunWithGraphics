package com.jeremyrawks.funwithgraphics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class UnicornActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unicorn);

        // 3) Assign the animation sequence to the ImageView widget
        ImageView unicornImage = findViewById(R.id.unicornImageView);
        Animation unicornAnim = AnimationUtils.loadAnimation(this, R.anim.animation_unicorn);

        // 4) Start the animation
        unicornImage.startAnimation(unicornAnim);
    }
}
