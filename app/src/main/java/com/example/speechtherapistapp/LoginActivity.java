package com.example.speechtherapistapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    //Variables
    EditText username;
    EditText password;

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://ai-speech-therapist-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.et4_username);
        password = findViewById(R.id.et4_password);
        ImageButton ib_back = findViewById(R.id.btn4_back);
        Button btn_login = findViewById(R.id.btn4_login);

        ib_back.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this, AccountActivity.class);
            startActivity(intent);
        });

        btn_login.setOnClickListener(view -> loginUser());
    }

    private void loginUser() {
        String logUsername = username.getText().toString();
        String logPassword = password.getText().toString();

        if (TextUtils.isEmpty(logUsername)){
            username.setError("Username can't be empty!");
            username.requestFocus();
        }else if (TextUtils.isEmpty(logPassword)) {
            password.setError("Password can't be empty!");
            password.requestFocus();
        }else {
            databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    //check if user exits
                    if (snapshot.hasChild(logUsername)){
                        //username exist
                        final String getPassword = snapshot.child(logUsername).child("password").getValue(String.class);

                        if (getPassword.equals(logPassword)){
                            Toast.makeText(LoginActivity.this, "Successfully Logged in!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                            intent.putExtra("userName", logUsername);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(LoginActivity.this, "Wrong Password!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(LoginActivity.this, "Invalid Input!", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                }
            });
        }
    }
}