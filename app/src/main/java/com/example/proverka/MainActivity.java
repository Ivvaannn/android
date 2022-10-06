package com.example.proverka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    Intent intent;
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
        String str1 = pass1.getText().toString();
        String str2 = pass2.getText().toString();

        String s = email.getText().toString();
        if(s.indexOf("@") > 0 && s.matches("[a-z]*@*[a-z,.]*") && s.indexOf(".")>2 && str1.equals(str2) && !str1.isEmpty()){
            intent = new Intent(this, GlavnayaMain.class);
            startActivity(intent);
            finish();
        }
        else if(!str1.equals(str2)) {
            ts = Toast.makeText(getApplicationContext(), "Пароли не совпадают!", Toast.LENGTH_SHORT);
            ts.show();
        }

        else if(str1.isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "Введите пароль!", Toast.LENGTH_SHORT);
            ts.show();
        }
        else  {
            ts = Toast.makeText(getApplicationContext(), "Неверный синтаксис почты!", Toast.LENGTH_SHORT);
            ts.show();
        }


    }
}
