package com.example.speechtherapistapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Card2Activity extends AppCompatActivity {

    ImageView num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, btnGame;

    private static final String MY_PREFS_C2 = "c2_level_prefs";
    private static final String C2_LVL_ONE_STATUS = "c2_level1_status";
    private static final String C2_LVL_TWO_STATUS = "c2_level2_status";
    private static final String C2_LVL_THREE_STATUS = "c2_level3_status";
    private static final String C2_LVL_FOUR_STATUS = "c2_level4_status";
    private static final String C2_LVL_FIVE_STATUS = "c2_level5_status";
    private static final String C2_LVL_SIX_STATUS = "c2_level6_status";
    private static final String C2_LVL_SEVEN_STATUS = "c2_level7_status";
    private static final String C2_LVL_EIGHT_STATUS = "c2_level8_status";
    private static final String C2_LVL_NINE_STATUS = "c2_level9_status";
    private static final String C2_LVL_TEN_STATUS = "c2_level10_status";

    boolean lvl1_status, lvl2_status, lvl3_status, lvl4_status, lvl5_status,
            lvl6_status, lvl7_status, lvl8_status, lvl9_status, lvl10_status;
    SharedPreferences myPreferences;
    SharedPreferences.Editor myEditor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);

        num0 = findViewById(R.id.c2_img_l0);
        num1 = findViewById(R.id.c2_img_l1);
        num2 = findViewById(R.id.c2_img_l2);
        num3 = findViewById(R.id.c2_img_l3);
        num4 = findViewById(R.id.c2_img_l4);
        num5 = findViewById(R.id.c2_img_l5);
        num6 = findViewById(R.id.c2_img_l6);
        num7 = findViewById(R.id.c2_img_l7);
        num8 = findViewById(R.id.c2_img_l8);
        num9 = findViewById(R.id.c2_img_l9);
        btnGame = findViewById(R.id.btn2_game);

        myPreferences = getSharedPreferences(MY_PREFS_C2, MODE_PRIVATE);
        myEditor = getSharedPreferences(MY_PREFS_C2, MODE_PRIVATE).edit();

        lvl1_status = myPreferences.getBoolean(C2_LVL_ONE_STATUS, false);
        lvl2_status = myPreferences.getBoolean(C2_LVL_TWO_STATUS, false);
        lvl3_status = myPreferences.getBoolean(C2_LVL_THREE_STATUS, false);
        lvl4_status = myPreferences.getBoolean(C2_LVL_FOUR_STATUS, false);
        lvl5_status = myPreferences.getBoolean(C2_LVL_FIVE_STATUS, false);
        lvl6_status = myPreferences.getBoolean(C2_LVL_SIX_STATUS, false);
        lvl7_status = myPreferences.getBoolean(C2_LVL_SEVEN_STATUS, false);
        lvl8_status = myPreferences.getBoolean(C2_LVL_EIGHT_STATUS, false);
        lvl9_status = myPreferences.getBoolean(C2_LVL_NINE_STATUS, false);
        lvl10_status = myPreferences.getBoolean(C2_LVL_TEN_STATUS, false);

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

        if(lvl7_status){
            num6.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num6.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl8_status){
            num7.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num7.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl9_status){
            num8.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num8.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl10_status){
            num9.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num9.setImageResource(R.drawable.lvl_lock);
        }

        num0.setOnClickListener(v -> {
            v.setEnabled(lvl1_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_ONE_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num0.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level1");
                startActivity(intent);
            }
            else{
                num0.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_ONE_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num1.setOnClickListener(v -> {
            lvl2_status = lvl1_status;
            v.setEnabled(lvl2_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_TWO_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num1.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level2");
                startActivity(intent);
            }
            else{
                num1.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_TWO_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num2.setOnClickListener(v -> {
            lvl3_status = lvl2_status;
            v.setEnabled(lvl3_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_THREE_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num2.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level3");
                startActivity(intent);
            }
            else{
                num2.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_THREE_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num3.setOnClickListener(v -> {
            lvl4_status = lvl3_status;
            v.setEnabled(lvl4_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_FOUR_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num3.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level4");
                startActivity(intent);
            }
            else{
                num3.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_FOUR_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num4.setOnClickListener(v -> {
            lvl5_status = lvl4_status;
            v.setEnabled(lvl5_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_FIVE_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num4.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level5");
                startActivity(intent);
            }
            else{
                num4.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_FIVE_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num5.setOnClickListener(v -> {
            lvl6_status = lvl5_status;
            v.setEnabled(lvl6_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_SIX_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num5.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level6");
                startActivity(intent);
            }
            else{
                num5.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_SIX_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num6.setOnClickListener(v -> {
            lvl7_status = lvl6_status;
            v.setEnabled(lvl7_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_SEVEN_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num6.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level7");
                startActivity(intent);
            }
            else{
                num6.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_SEVEN_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num7.setOnClickListener(v -> {
            lvl8_status = lvl7_status;
            v.setEnabled(lvl8_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_EIGHT_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num7.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level8");
                startActivity(intent);
            }
            else{
                num7.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_EIGHT_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num8.setOnClickListener(v -> {
            lvl9_status = lvl8_status;
            v.setEnabled(lvl9_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_NINE_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num8.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level9");
                startActivity(intent);
            }
            else{
                num8.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_NINE_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num9.setOnClickListener(v -> {
            lvl10_status = lvl9_status;
            v.setEnabled(lvl10_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C2_LVL_TEN_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num9.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card2Activity.this, LearnActivity.class);
                intent.putExtra("cardName", "card2");
                intent.putExtra("levelName", "level10");
                startActivity(intent);
            }
            else{
                num9.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C2_LVL_TEN_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        /*btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            v.setEnabled(false);
            if(count2.get() == 10) {
                v.setEnabled(true);
                Intent intent = new Intent(Card2Activity.this, .class);
                startActivity(intent);
            }
            }
        });*/
    }
}