package com.example.speechtherapistapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Card6Activity extends AppCompatActivity {

    ImageView num0, num1, num2, num3, num4, num5, btnGame;

    private static final String MY_PREFS_C6 = "c6_level_prefs";
    private static final String C6_LVL_ONE_STATUS = "c6_level1_status";
    private static final String C6_LVL_TWO_STATUS = "c6_level2_status";
    private static final String C6_LVL_THREE_STATUS = "c6_level3_status";
    private static final String C6_LVL_FOUR_STATUS = "c6_level4_status";
    private static final String C6_LVL_FIVE_STATUS = "c6_level5_status";
    private static final String C6_LVL_SIX_STATUS = "c6_level6_status";

    boolean lvl1_status, lvl2_status, lvl3_status, lvl4_status, lvl5_status,
            lvl6_status;
    SharedPreferences myPreferences;
    SharedPreferences.Editor myEditor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card6);

        num0 = findViewById(R.id.c6_img_l0);
        num1 = findViewById(R.id.c6_img_l1);
        num2 = findViewById(R.id.c6_img_l2);
        num3 = findViewById(R.id.c6_img_l3);
        num4 = findViewById(R.id.c6_img_l4);
        num5 = findViewById(R.id.c6_img_l5);
        btnGame = findViewById(R.id.btn6_game);

        myPreferences = getSharedPreferences(MY_PREFS_C6, MODE_PRIVATE);
        myEditor = getSharedPreferences(MY_PREFS_C6, MODE_PRIVATE).edit();

        lvl1_status = myPreferences.getBoolean(C6_LVL_ONE_STATUS, false);
        lvl2_status = myPreferences.getBoolean(C6_LVL_TWO_STATUS, false);
        lvl3_status = myPreferences.getBoolean(C6_LVL_THREE_STATUS, false);
        lvl4_status = myPreferences.getBoolean(C6_LVL_FOUR_STATUS, false);
        lvl5_status = myPreferences.getBoolean(C6_LVL_FIVE_STATUS, false);
        lvl6_status = myPreferences.getBoolean(C6_LVL_SIX_STATUS, false);

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

        if(lvl5_status){
            num4.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num4.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl6_status){
            num5.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num5.setImageResource(R.drawable.lvl_lock);
        }

        num0.setOnClickListener(v -> {
            v.setEnabled(lvl1_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C6_LVL_ONE_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num0.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card6Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card6");
                intent.putExtra("levelName", "level1");
                startActivity(intent);
            }
            else{
                num0.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C6_LVL_ONE_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num1.setOnClickListener(v -> {
            lvl2_status = lvl1_status;
            v.setEnabled(lvl2_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C6_LVL_TWO_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num1.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card6Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card6");
                intent.putExtra("levelName", "level2");
                startActivity(intent);
            }
            else{
                num1.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C6_LVL_TWO_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num2.setOnClickListener(v -> {
            lvl3_status = lvl2_status;
            v.setEnabled(lvl3_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C6_LVL_THREE_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num2.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card6Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card6");
                intent.putExtra("levelName", "level3");
                startActivity(intent);
            }
            else{
                num2.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C6_LVL_THREE_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num3.setOnClickListener(v -> {
            lvl4_status = lvl3_status;
            v.setEnabled(lvl4_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C6_LVL_FOUR_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num3.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card6Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card6");
                intent.putExtra("levelName", "level4");
                startActivity(intent);
            }
            else{
                num3.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C6_LVL_FOUR_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num4.setOnClickListener(v -> {
            lvl5_status = lvl4_status;
            v.setEnabled(lvl5_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C6_LVL_FIVE_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num4.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card6Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card6");
                intent.putExtra("levelName", "level5");
                startActivity(intent);
            }
            else{
                num4.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C6_LVL_FIVE_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num5.setOnClickListener(v -> {
            lvl6_status = lvl5_status;
            v.setEnabled(lvl6_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C6_LVL_SIX_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num5.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card6Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card6");
                intent.putExtra("levelName", "level6");
                startActivity(intent);
            }
            else{
                num5.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C6_LVL_SIX_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        /*btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            v.setEnabled(false);
            if(count6.get() == 6) {
                v.setEnabled(true);
                Intent intent = new Intent(Card6Activity.this, .class);
                startActivity(intent);
            }
            }
        });*/
    }
}