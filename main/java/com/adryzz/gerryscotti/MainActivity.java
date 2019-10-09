package com.adryzz.gerryscotti;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        Button b8 = findViewById(R.id.button8);
        Button b9 = findViewById(R.id.button9);
        Button b10 = findViewById(R.id.button10);
        Button b11 = findViewById(R.id.button11);
        Button b12 = findViewById(R.id.button12);

        final MediaPlayer m1 = MediaPlayer.create(this, R.raw.ciaone);
        final MediaPlayer m2 = MediaPlayer.create(this, R.raw.wall);
        final MediaPlayer m3 = MediaPlayer.create(this, R.raw.ok);
        final MediaPlayer m4 = MediaPlayer.create(this, R.raw.signori);
        final MediaPlayer m5 = MediaPlayer.create(this, R.raw.dai);
        final MediaPlayer m6 = MediaPlayer.create(this, R.raw.massacra);
        final MediaPlayer m7 = MediaPlayer.create(this, R.raw.attacca);
        final MediaPlayer m8 = MediaPlayer.create(this, R.raw.efatta);
        final MediaPlayer m9 = MediaPlayer.create(this, R.raw.cuccagna);
        final MediaPlayer m10 = MediaPlayer.create(this, R.raw.fiu);
        final MediaPlayer m11= MediaPlayer.create(this, R.raw.scusi);
        final MediaPlayer m12 = MediaPlayer.create(this, R.raw.losento);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m3.start();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m4.start();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m5.start();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m6.start();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m7.start();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m8.start();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m9.start();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m10.start();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m11.start();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m12.start();
            }
        });




    }
}
