package com.example.speechtherapistapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.io.IOException;

public class AudioActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    String audioUrl, getWordDB;
    MediaPlayer mediaPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        imageView = findViewById(R.id.iv_img);
        textView = findViewById(R.id.tv_word);
        ImageButton ib_back = findViewById(R.id.btn_back);
        ImageButton ib_aud = findViewById(R.id.btn_aud);
        Button btn_vd = findViewById(R.id.btn_video);
        Button btn_img = findViewById(R.id.btn_img);
        Button btn_cont = findViewById(R.id.btn_continue);

        String card = getIntent().getStringExtra("cardName");
        String level = getIntent().getStringExtra("levelName");

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("activity");

        reference.child(card).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.hasChild(level))
                {
                    getWordDB = snapshot.child(level).child("word").getValue(String.class);
                    final String getImgDB = snapshot.child(level).child("image").getValue(String.class);
                    audioUrl = snapshot.child(level).child("audio").getValue(String.class);

                    textView.setText(getWordDB);
                    Picasso.get()
                            .load(getImgDB)
                            .into(imageView);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        ib_aud.setOnClickListener(v -> {
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            try {
                mediaPlayer.setDataSource(audioUrl);
                mediaPlayer.prepare();
                mediaPlayer.start();
            }
            catch (IOException e)
            {
                Toast.makeText(AudioActivity.this, "Error occurred = " + e, Toast.LENGTH_SHORT).show();
            }
        });

        ib_back.setOnClickListener(view -> {
            Intent intent = new Intent(AudioActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        btn_img.setOnClickListener(v -> {
            Intent intent = new Intent(AudioActivity.this, AudioActivity.class);
            startActivity(intent);
        });

        btn_vd.setOnClickListener(v -> {
            Intent intent = new Intent(AudioActivity.this, LearnActivity.class);
            startActivity(intent);
        });

        btn_cont.setOnClickListener(view -> {
            Intent intent = new Intent(AudioActivity.this, RecordActivity.class);
            intent.putExtra("wordDB", getWordDB);
            startActivity(intent);
        });
    }
}