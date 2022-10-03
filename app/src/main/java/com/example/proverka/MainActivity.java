package com.example.proverka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    TextView pass1;
    TextView pass2;
    TextView email, text2;
    Toast ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickBTN(View view) {
        pass1 = findViewById(R.id.editTextTextPassword);
        pass2 = findViewById(R.id.editTextTextPassword2);
        text = findViewById(R.id.texttik);
        email = findViewById(R.id.editTextTextEmailAddress);
        text2 = findViewById(R.id.textView);
        String str1 = pass1.getText().toString();
        String str2 = pass2.getText().toString();

        if(str1.equals(str2)) {
            text.setText("Равно!");
        }
        else{
            text.setText("Не равно!");
        }
        String s = email.getText().toString();
        if(s.indexOf("@") > 0 && s.matches("[a-z]*@*[a-z,.]*") && s.indexOf(".")>2){
            ts = Toast.makeText(getApplicationContext(), "Собачка есть, буквы маленькие и отсутствуют спецсимволы!", Toast.LENGTH_SHORT);
            ts.show();
        }
        else {
            ts = Toast.makeText(getApplicationContext(), "Собачки нет или большие буквы или присутствуют спецсимволы!", Toast.LENGTH_SHORT);
            ts.show();
        }


    }
}
