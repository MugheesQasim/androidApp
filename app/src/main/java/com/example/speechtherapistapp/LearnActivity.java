package com.example.speechtherapistapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LearnActivity extends AppCompatActivity {

    private VideoView vdoView;
    String getWordDB;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        vdoView = findViewById(R.id.videoView);
        ImageButton ib_back = findViewById(R.id.btn_backAct);
        Button btn_vd = findViewById(R.id.btn_video);
        Button btn_img = findViewById(R.id.btn_img);
        Button btn_cont = findViewById(R.id.btn_continue);
        pd = new ProgressDialog(LearnActivity.this);
        pd.setMessage("Buffering... Please wait!");
        pd.show();

        String card = getIntent().getStringExtra("cardName");
        String level = getIntent().getStringExtra("levelName");

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("activity");

        reference.child(card).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.hasChild(level))
                {
                    getWordDB = snapshot.child(level).child("word").getValue(String.class);
                    //video url
                    final String getVdoDB = snapshot.child(level).child("video").getValue(String.class);
                    Uri uri = Uri.parse(getVdoDB);
                    vdoView.setVideoURI(uri);
                    vdoView.start();
                    vdoView.setOnPreparedListener(mp -> pd.dismiss());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        switch (card) {
            case "card2":
                ib_back.setOnClickListener(view -> {
                    Intent intent = new Intent(LearnActivity.this, Card2Activity.class);
                    startActivity(intent);
                });
                break;
            case "card3":
                ib_back.setOnClickListener(view -> {
                    Intent intent = new Intent(LearnActivity.this, Card3Activity.class);
                    startActivity(intent);
                });
                break;
            case "card4":
                ib_back.setOnClickListener(view -> {
                    Intent intent = new Intent(LearnActivity.this, Card4Activity.class);
                    startActivity(intent);
                });
                break;
            case "card5":
                ib_back.setOnClickListener(view -> {
                    Intent intent = new Intent(LearnActivity.this, Card5Activity.class);
                    startActivity(intent);
                });
                break;
        }

        btn_img.setOnClickListener(v -> {
            Intent intent = new Intent(LearnActivity.this, AudioActivity.class);
            intent.putExtra("cardName", card);
            intent.putExtra("levelName", level);
            startActivity(intent);
        });

        btn_vd.setOnClickListener(v -> {
            Intent intent = new Intent(LearnActivity.this, LearnActivity.class);
            startActivity(intent);
        });

        btn_cont.setOnClickListener(view -> {
            Intent intent = new Intent(LearnActivity.this, RecordActivity.class);
            intent.putExtra("wordDB", getWordDB);
            startActivity(intent);
        });
    }
}