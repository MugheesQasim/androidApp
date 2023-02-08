package com.example.speechtherapistapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LearnActivity2 extends AppCompatActivity {

    private VideoView vdoView2;
    String getWordDB;
    ProgressDialog pd2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn2);

        vdoView2 = findViewById(R.id.videoView2);
        ImageButton ib_back = findViewById(R.id.btn_backAct2);
        Button btn_cont = findViewById(R.id.btn_continue2);
        pd2 = new ProgressDialog(LearnActivity2.this);
        pd2.setMessage("Buffering... Please wait!");
        pd2.show();

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
                    vdoView2.setVideoURI(uri);
                    vdoView2.start();
                    vdoView2.setOnPreparedListener(mp -> pd2.dismiss());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        ib_back.setOnClickListener(view -> {
            Intent intent = new Intent(LearnActivity2.this, HomeActivity.class);
            startActivity(intent);
        });

        btn_cont.setOnClickListener(view -> {
            Intent intent = new Intent(LearnActivity2.this, RecordActivity.class);
            intent.putExtra("wordDB", getWordDB);
            startActivity(intent);
        });

    }
}