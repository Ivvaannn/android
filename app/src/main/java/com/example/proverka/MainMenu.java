package com.example.proverka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void ClickRegistr(View view) {
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void ClickVchod(View view) {
        intent = new Intent(this, VhodMain.class);
        startActivity(intent);
        finish();
    }
}