package com.example.speechtherapistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class AccuracyActivity extends AppCompatActivity {

    ImageButton ib_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accuracy);

        ib_back = findViewById(R.id.btnC_back);
        TextView tv_percent = findViewById(R.id.Text1);

        String cosine = getIntent().getStringExtra("percentage");

        tv_percent.setText(cosine);

        ib_back.setOnClickListener(view -> {
            Intent intent = new Intent(AccuracyActivity.this, RecordActivity.class);
            startActivity(intent);
        });
    }
}