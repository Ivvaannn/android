package com.example.proverka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    TextView pass1;
    TextView pass2;
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickBTN(View view) {
        pass1 = findViewById(R.id.editTextTextPassword);
        pass2 = findViewById(R.id.editTextTextPassword2);
        text = findViewById(R.id.texttik);
        String str1 = pass1.getText().toString();
        String str2 = pass2.getText().toString();

        if(str1.equals(str2)) {
            text.setText("Равно!");
        }
        else{
            text.setText("Не равно!");
        }
    }
}