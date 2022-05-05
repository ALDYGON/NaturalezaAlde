package com.example.naturalezaalde;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class sonidosNat extends AppCompatActivity {
    ImageButton btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonidos_nat);
        btn1=findViewById(R.id.agua);
        btn2=findViewById(R.id.lluvia);
        btn3=findViewById(R.id.viento);
        btn4=findViewById(R.id.trueno);
        btn5=findViewById(R.id.mar);

        MediaPlayer mp = MediaPlayer.create(sonidosNat.this, R.raw.sonidoagua);
        MediaPlayer mp1 = MediaPlayer.create(sonidosNat.this, R.raw.sonidolluvia);
        MediaPlayer mp2 = MediaPlayer.create(sonidosNat.this, R.raw.sonidoviento);
        MediaPlayer mp3 = MediaPlayer.create(sonidosNat.this, R.raw.sonidotruenos);
        MediaPlayer mp4 = MediaPlayer.create(sonidosNat.this, R.raw.sonidomar);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()){
                    mp.pause();
                }else{
                    mp.start();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp1.isPlaying()){
                    mp1.pause();
                }else{
                    mp1.start();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp2.isPlaying()){
                    mp2.pause();
                }else {
                    mp2.start();
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp3.isPlaying()){
                    mp3.pause();
                }else{
                    mp3.start();
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp4.isPlaying()){
                    mp4.pause();
                }else{
                    mp4.start();
                }
            }
        });
    }
}