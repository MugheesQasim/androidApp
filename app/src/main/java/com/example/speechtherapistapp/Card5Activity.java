package com.example.speechtherapistapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Card5Activity extends AppCompatActivity {

    ImageView num0, num1, num2, num3, btnGame;

    private static final String MY_PREFS_C5 = "c5_level_prefs";
    private static final String C5_LVL_ONE_STATUS = "c5_level1_status";
    private static final String C5_LVL_TWO_STATUS = "c5_level2_status";
    private static final String C5_LVL_THREE_STATUS = "c5_level3_status";
    private static final String C5_LVL_FOUR_STATUS = "c5_level4_status";

    boolean lvl1_status, lvl2_status, lvl3_status, lvl4_status;
    SharedPreferences myPreferences;
    SharedPreferences.Editor myEditor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card5);

        num0 = findViewById(R.id.c5_img_l0);
        num1 = findViewById(R.id.c5_img_l1);
        num2 = findViewById(R.id.c5_img_l2);
        num3 = findViewById(R.id.c5_img_l3);
        btnGame = findViewById(R.id.btn5_game);

        myPreferences = getSharedPreferences(MY_PREFS_C5, MODE_PRIVATE);
        myEditor = getSharedPreferences(MY_PREFS_C5, MODE_PRIVATE).edit();

        lvl1_status = myPreferences.getBoolean(C5_LVL_ONE_STATUS, false);
        lvl2_status = myPreferences.getBoolean(C5_LVL_TWO_STATUS, false);
        lvl3_status = myPreferences.getBoolean(C5_LVL_THREE_STATUS, false);
        lvl4_status = myPreferences.getBoolean(C5_LVL_FOUR_STATUS, false);

        if(lvl1_status){
            num0.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num0.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl2_status){
            num1.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num1.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl3_status){
            num2.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num2.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl4_status){
            num3.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num3.setImageResource(R.drawable.lvl_lock);
        }

        num0.setOnClickListener(v -> {
            v.setEnabled(lvl1_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C5_LVL_ONE_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num0.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card5Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card5");
                intent.putExtra("levelName", "level1");
                Card5Activity.this.startActivity(intent);
            }
            else{
                num0.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C5_LVL_ONE_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num1.setOnClickListener(v -> {
            lvl2_status = lvl1_status;
            v.setEnabled(lvl2_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C5_LVL_TWO_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num1.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card5Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card5");
                intent.putExtra("levelName", "level2");
                startActivity(intent);
            }
            else{
                num1.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C5_LVL_TWO_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num2.setOnClickListener(v -> {
            lvl3_status = lvl2_status;
            v.setEnabled(lvl3_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C5_LVL_THREE_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num2.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card5Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card5");
                intent.putExtra("levelName", "level3");
                startActivity(intent);
            }
            else{
                num2.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C5_LVL_THREE_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num3.setOnClickListener(v -> {
            lvl4_status = lvl3_status;
            v.setEnabled(lvl4_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C5_LVL_FOUR_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num3.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card5Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card5");
                intent.putExtra("levelName", "level4");
                startActivity(intent);
            }
            else{
                num3.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C5_LVL_FOUR_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        /*btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            v.setEnabled(false);
            if(count5.get() == 4) {
                v.setEnabled(true);
                Intent intent = new Intent(Card5Activity.this, .class);
                startActivity(intent);
            }
            }
        });*/
    }
}