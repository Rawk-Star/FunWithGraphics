package com.jeremyrawks.funwithgraphics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SmileyActivity extends AppCompatActivity {

    ImageView mSmileyImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smiley);

        mSmileyImageView = findViewById(R.id.SmileyImageView);
        mSmileyImageView.setImageDrawable(new Smiley());

    }
}
