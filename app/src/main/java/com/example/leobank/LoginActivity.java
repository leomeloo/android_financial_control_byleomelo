package com.example.leobank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText tuser, tpassword;
    Button tlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tuser = findViewById(R.id.user);
        tpassword = findViewById(R.id.password);
        tlogin = findViewById(R.id.login);

        String login, senha;

        tlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tuser.getText().toString().equals("leomeloo") && tpassword.getText().toString().equals("123")) {
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(getApplicationContext(), "Usuario ou senha invalido", Toast.LENGTH_LONG).show();
            }
        });
    }
}

