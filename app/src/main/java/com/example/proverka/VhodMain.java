package com.example.proverka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class VhodMain extends AppCompatActivity {
TextView pass, pochta;
Toast ts;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vhod_main);

    }

    public void VhodClickBtn(View view) {
        pass = findViewById(R.id.editTextTextPassword3);
        pochta = findViewById(R.id.editTextTextEmailAddress2);
        String s = pochta.getText().toString();
        String pas = pass.getText().toString();
        if(s.indexOf("@") > 0 && s.matches("[a-z]*@*[a-z,.]*") && s.indexOf(".")>2 && !pas.isEmpty()){
            intent = new Intent(this, GlavnayaMain.class);
            startActivity(intent);
            finish();
        }
        else if (pas.isEmpty()){
            ts = Toast.makeText(getApplicationContext(), "Введите пароль!", Toast.LENGTH_SHORT);
            ts.show();
        }
        else{
            ts = Toast.makeText(getApplicationContext(), "Неверный синтаксис почты!", Toast.LENGTH_SHORT);
            ts.show();
        }
    }
}