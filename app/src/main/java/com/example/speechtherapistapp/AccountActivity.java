package com.example.speechtherapistapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        //Variables
        Button btn_signUp = findViewById(R.id.btn2_signup);
        Button btn_signIn = findViewById(R.id.btn2_signIn);

        btn_signUp.setOnClickListener(view -> {
            Intent intent = new Intent(AccountActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        btn_signIn.setOnClickListener(view -> {
            Intent intent = new Intent(AccountActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}