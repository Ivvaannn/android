package com.example.proverka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceActivity;

import java.util.Timer;
import java.util.TimerTask;

public class zagruzka extends AppCompatActivity {
Intent intent;
Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zagruzka);
        handler = new Handler();
        intent = new Intent(this, MainMenu.class);
        handler.postDelayed(new Runnable() {
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 2000);

    }

}
