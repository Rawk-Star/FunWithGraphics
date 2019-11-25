package com.jeremyrawks.funwithgraphics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRockOutClicked(View view) {
        Intent intent = new Intent(this, RockOutActivity.class);
        startActivity(intent);
    }

    public void onSmileClicked(View view) {
        Intent intent = new Intent(this, SmileyActivity.class);
        startActivity(intent);
    }

    public void onFlossClicked(View view) {
        Intent intent = new Intent(this, FlossActivity.class);
        startActivity(intent);
    }

    public void onUnicornClicked(View view) {
        Intent intent = new Intent(this, UnicornActivity.class);
        startActivity(intent);
    }
}
