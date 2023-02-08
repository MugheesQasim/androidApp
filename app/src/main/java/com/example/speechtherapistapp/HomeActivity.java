package com.example.speechtherapistapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView logOut;
    TextView tv_user;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv_user = findViewById(R.id.yourName);
        logOut = findViewById(R.id.logout);

        String user_name = getIntent().getStringExtra("userName");
        tv_user.setText(user_name);

        CardView c1 = findViewById(R.id.card1);
        CardView c2 = findViewById(R.id.card2);
        CardView c3 = findViewById(R.id.card3);
        CardView c4 = findViewById(R.id.card4);
        CardView c5 = findViewById(R.id.card5);
        CardView c6 = findViewById(R.id.card6);
        CardView c_e1 = findViewById(R.id.card_exer1);
        CardView c_e2 = findViewById(R.id.card_exer2);
        CardView c_e3 = findViewById(R.id.card_exer3);
        CardView c_e4 = findViewById(R.id.card_exer4);
        CardView c_e5 = findViewById(R.id.card_exer5);
        CardView c_e6 = findViewById(R.id.card_exer6);
        CardView c_e7 = findViewById(R.id.card_exer7);
        CardView c_e8 = findViewById(R.id.card_exer8);
        CardView c_e9 = findViewById(R.id.card_exer9);

        c_e1.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });
        c_e2.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });
        c_e3.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });
        c_e4.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });
        c_e5.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });
        c_e6.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });
        c_e7.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });
        c_e8.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });
        c_e9.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ExerciseActivity.class);
            startActivity(intent);
        });

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);

        logOut.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, AccountActivity.class);
            startActivity(intent);
        });

    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(@NonNull View v){
        Intent i;
        switch (v.getId()){
            case R.id.card1 :
                i = new Intent(this, Card1Activity.class);
                startActivity(i);
                break;
            case R.id.card2 :
                i = new Intent(this, Card2Activity.class);
                startActivity(i);
                break;
            case R.id.card3 :
                i = new Intent(this, Card3Activity.class);
                startActivity(i);
                break;
            case R.id.card4 :
                i = new Intent(this, Card4Activity.class);
                startActivity(i);
                break;
            case R.id.card5 :
                i = new Intent(this, Card5Activity.class);
                startActivity(i);
                break;
            case R.id.card6 :
                i = new Intent(this, Card6Activity.class);
                startActivity(i);
                break;
        }
    }
}