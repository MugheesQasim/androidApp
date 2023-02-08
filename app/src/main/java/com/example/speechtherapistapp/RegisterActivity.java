package com.example.speechtherapistapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegisterActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView imageView;
    String genderChosen;

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://ai-speech-therapist-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText email = findViewById(R.id.et3_email);
        final EditText username = findViewById(R.id.et3_username);
        final EditText password = findViewById(R.id.et3_password);
        final EditText conPassword = findViewById(R.id.et3_cnfrmPass);
        final Button btn_register = findViewById(R.id.btn3_register);
        final ImageButton ib_back = findViewById(R.id.btn3_back);
        final String[] gender = {"Choose Your Gender", "Female", "Male"};

        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.iv3_pic);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(RegisterActivity.this, android.R.layout.simple_dropdown_item_1line, gender);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(gender[0].equals(spinner.getItemAtPosition(i).toString())){
                    imageView.setImageResource(R.drawable.gender);
                    genderChosen = "Other";
                }
                else if (gender[1].equals(spinner.getItemAtPosition(i).toString())) {
                    imageView.setImageResource(R.drawable.female_pic);
                    genderChosen = "Female";
                }
                else if (gender[2].equals(spinner.getItemAtPosition(i).toString())) {
                    imageView.setImageResource(R.drawable.male_pic);
                    genderChosen = "Male";
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ib_back.setOnClickListener(view -> {
            Intent intent = new Intent(RegisterActivity.this, AccountActivity.class);
            startActivity(intent);
        });

        btn_register.setOnClickListener(view -> {

            final String regEmail = email.getText().toString();
            final String regUsername = username.getText().toString();
            final String regPassword = password.getText().toString();
            final String regConPassword = conPassword.getText().toString();

            if(!(!regEmail.isEmpty() && !regUsername.isEmpty() && !regPassword.isEmpty() && !regConPassword.isEmpty())){
                Toast.makeText(RegisterActivity.this, "Please fill all fields!", Toast.LENGTH_SHORT).show();
            }
            else if(!regPassword.equals(regConPassword)){
                Toast.makeText(RegisterActivity.this, "Passwords are not matching!", Toast.LENGTH_SHORT).show();
            }
            else{
                databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        //check if username has not taken already by someone else
                        if (snapshot.hasChild(regUsername)){
                            Toast.makeText(RegisterActivity.this,"User name is already taken! Please register with unique name.", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            //Storing data to Firebase Realtime Database
                            databaseReference.child("users").child(regUsername).child("password").setValue(regPassword);
                            databaseReference.child("users").child(regUsername).child("gender").setValue(genderChosen);
                            databaseReference.child("users").child(regUsername).child("email").setValue(regEmail);

                            Toast.makeText(RegisterActivity.this, "User registered successfully!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
                            startActivity(intent);
                        }
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                    }
                });
            }
        });
    }
}