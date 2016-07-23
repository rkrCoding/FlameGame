package com.rkrgames.flamesgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent playIntent= new Intent(this, playActivity.class);
        final Intent aboutIntent= new Intent(this, aboutActivity.class);
        ImageButton btnplay = (ImageButton)findViewById(R.id.imgplay);
        ImageButton btnabout = (ImageButton)findViewById(R.id.imgabout);
        ImageButton btnexit = (ImageButton)findViewById(R.id.imgExit);
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(playIntent);
            }
        });
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aboutIntent);
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
