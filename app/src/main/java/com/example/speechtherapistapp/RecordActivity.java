package com.example.speechtherapistapp;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import java.util.ArrayList;

public class RecordActivity extends AppCompatActivity {

    protected static final int RESULT_SPEECH = 1;
    private TextView tvText;
    Button btn_check;
    //String wordCompare;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        if(!Python.isStarted())
            Python.start(new AndroidPlatform(this));

        Python py = Python.getInstance();
        final PyObject pyObj = py.getModule("cosineSimilarity");

        String wordCompare  = getIntent().getStringExtra("wordDB");
        tvText = findViewById(R.id.tvText);
        TextView tvDB = findViewById(R.id.tvTxtDB);
        tvDB.setText(wordCompare);
        btn_check = findViewById(R.id.btn_check);
        ImageButton btnSpeak = findViewById(R.id.btnSpeak);
        ImageButton ib_back = findViewById(R.id.btn_back);

        btnSpeak.setOnClickListener(view -> {
            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ur-PK");
            try {
                startActivityForResult(intent, RESULT_SPEECH);
                tvText.setText("");
                //wordInput = tvText.getText().toString();
            } catch (ActivityNotFoundException e) {
                Toast.makeText(getApplicationContext(), "Your device doesn't support Speech to Text", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        });

        btn_check.setOnClickListener(v -> {
            // function name & arguments
            PyObject obj = pyObj.callAttr("cosine_similarity", tvText.getText().toString(), wordCompare);
            String cosinePer = obj.toString();
            Intent intent = new Intent(RecordActivity.this, AccuracyActivity.class);
            intent.putExtra("percentage", cosinePer);
            startActivity(intent);
        });

        ib_back.setOnClickListener(view -> {
            Intent intent = new Intent(RecordActivity.this, AudioActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_SPEECH) {
            if (resultCode == RESULT_OK && data != null) {
                ArrayList<String> text = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                tvText.setText(text.get(0));
            }
        }
    }
}