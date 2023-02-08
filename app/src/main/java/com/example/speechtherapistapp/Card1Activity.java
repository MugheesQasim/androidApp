package com.example.speechtherapistapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Card1Activity extends AppCompatActivity {

    ImageView num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11 ,num12,
            num13, num14, num15, num16, num17, num18, num19, num20, num21, num22, num23, num24,
            num25, num26, num27, num28, num29, num30, num31 ,num32, num33, num34, num35;

    private static final String MY_PREFS_C1 = "c1_level_prefs";
    private static final String C1_LVL1_STATUS = "c1_level1_status";
    private static final String C1_LVL2_STATUS = "c1_level2_status";
    private static final String C1_LVL3_STATUS = "c1_level3_status";
    private static final String C1_LVL4_STATUS = "c1_level4_status";
    private static final String C1_LVL5_STATUS = "c1_level5_status";
    private static final String C1_LVL6_STATUS = "c1_level6_status";
    private static final String C1_LVL7_STATUS = "c1_level7_status";
    private static final String C1_LVL8_STATUS = "c1_level8_status";
    private static final String C1_LVL9_STATUS = "c1_level9_status";
    private static final String C1_LVL10_STATUS = "c1_level10_status";
    private static final String C1_LVL11_STATUS = "c1_level11_status";
    private static final String C1_LVL12_STATUS = "c1_level12_status";
    private static final String C1_LVL13_STATUS = "c1_level13_status";
    private static final String C1_LVL14_STATUS = "c1_level14_status";
    private static final String C1_LVL15_STATUS = "c1_level15_status";
    private static final String C1_LVL16_STATUS = "c1_level16_status";
    private static final String C1_LVL17_STATUS = "c1_level17_status";
    private static final String C1_LVL18_STATUS = "c1_level18_status";
    private static final String C1_LVL19_STATUS = "c1_level19_status";
    private static final String C1_LVL20_STATUS = "c1_level20_status";
    private static final String C1_LVL21_STATUS = "c1_level21_status";
    private static final String C1_LVL22_STATUS = "c1_level22_status";
    private static final String C1_LVL23_STATUS = "c1_level23_status";
    private static final String C1_LVL24_STATUS = "c1_level24_status";
    private static final String C1_LVL25_STATUS = "c1_level25_status";
    private static final String C1_LVL26_STATUS = "c1_level26_status";
    private static final String C1_LVL27_STATUS = "c1_level27_status";
    private static final String C1_LVL28_STATUS = "c1_level28_status";
    private static final String C1_LVL29_STATUS = "c1_level29_status";
    private static final String C1_LVL30_STATUS = "c1_level30_status";
    private static final String C1_LVL31_STATUS = "c1_level31_status";
    private static final String C1_LVL32_STATUS = "c1_level32_status";
    private static final String C1_LVL33_STATUS = "c1_level33_status";
    private static final String C1_LVL34_STATUS = "c1_level34_status";
    private static final String C1_LVL35_STATUS = "c1_level35_status";
    private static final String C1_LVL36_STATUS = "c1_level36_status";

    boolean lvl1_status, lvl2_status, lvl3_status, lvl4_status, lvl5_status, lvl6_status, lvl7_status, lvl8_status, lvl9_status, lvl10_status,
            lvl11_status, lvl12_status, lvl13_status, lvl14_status, lvl15_status, lvl16_status, lvl17_status, lvl18_status, lvl19_status,
            lvl20_status, lvl21_status, lvl22_status, lvl23_status, lvl24_status, lvl25_status, lvl26_status, lvl27_status, lvl28_status,
            lvl29_status, lvl30_status, lvl31_status, lvl32_status, lvl33_status, lvl34_status, lvl35_status, lvl36_status;
    SharedPreferences myPreferences;
    SharedPreferences.Editor myEditor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);

        num0 = findViewById(R.id.c1_img_l0);
        num1 = findViewById(R.id.c1_img_l1);
        num2 = findViewById(R.id.c1_img_l2);
        num3 = findViewById(R.id.c1_img_l3);
        num4 = findViewById(R.id.c1_img_l4);
        num5 = findViewById(R.id.c1_img_l5);
        num6 = findViewById(R.id.c1_img_l6);
        num7 = findViewById(R.id.c1_img_l7);
        num8 = findViewById(R.id.c1_img_l8);
        num9 = findViewById(R.id.c1_img_l9);
        num10 = findViewById(R.id.c1_img_l10);
        num11 = findViewById(R.id.c1_img_l11);
        num12 = findViewById(R.id.c1_img_l12);
        num13 = findViewById(R.id.c1_img_l13);
        num14 = findViewById(R.id.c1_img_l14);
        num15 = findViewById(R.id.c1_img_l15);
        num16 = findViewById(R.id.c1_img_l16);
        num17 = findViewById(R.id.c1_img_l17);
        num18 = findViewById(R.id.c1_img_l18);
        num19 = findViewById(R.id.c1_img_l19);
        num20 = findViewById(R.id.c1_img_l20);
        num21 = findViewById(R.id.c1_img_l21);
        num22 = findViewById(R.id.c1_img_l22);
        num23 = findViewById(R.id.c1_img_l23);
        num24 = findViewById(R.id.c1_img_l24);
        num25 = findViewById(R.id.c1_img_l25);
        num26 = findViewById(R.id.c1_img_l26);
        num27 = findViewById(R.id.c1_img_l27);
        num28 = findViewById(R.id.c1_img_l28);
        num29 = findViewById(R.id.c1_img_l29);
        num30 = findViewById(R.id.c1_img_l30);
        num31 = findViewById(R.id.c1_img_l31);
        num32 = findViewById(R.id.c1_img_l32);
        num33 = findViewById(R.id.c1_img_l33);
        num34 = findViewById(R.id.c1_img_l34);
        num35 = findViewById(R.id.c1_img_l35);

        myPreferences = getSharedPreferences(MY_PREFS_C1, MODE_PRIVATE);
        myEditor = getSharedPreferences(MY_PREFS_C1, MODE_PRIVATE).edit();

        lvl1_status = myPreferences.getBoolean(C1_LVL1_STATUS, false);
        lvl2_status = myPreferences.getBoolean(C1_LVL2_STATUS, false);
        lvl3_status = myPreferences.getBoolean(C1_LVL3_STATUS, false);
        lvl4_status = myPreferences.getBoolean(C1_LVL4_STATUS, false);
        lvl5_status = myPreferences.getBoolean(C1_LVL5_STATUS, false);
        lvl6_status = myPreferences.getBoolean(C1_LVL6_STATUS, false);
        lvl7_status = myPreferences.getBoolean(C1_LVL7_STATUS, false);
        lvl8_status = myPreferences.getBoolean(C1_LVL8_STATUS, false);
        lvl9_status = myPreferences.getBoolean(C1_LVL9_STATUS, false);
        lvl10_status = myPreferences.getBoolean(C1_LVL10_STATUS, false);
        lvl11_status = myPreferences.getBoolean(C1_LVL11_STATUS, false);
        lvl12_status = myPreferences.getBoolean(C1_LVL12_STATUS, false);
        lvl13_status = myPreferences.getBoolean(C1_LVL13_STATUS, false);
        lvl14_status = myPreferences.getBoolean(C1_LVL14_STATUS, false);
        lvl15_status = myPreferences.getBoolean(C1_LVL15_STATUS, false);
        lvl16_status = myPreferences.getBoolean(C1_LVL16_STATUS, false);
        lvl17_status = myPreferences.getBoolean(C1_LVL17_STATUS, false);
        lvl18_status = myPreferences.getBoolean(C1_LVL18_STATUS, false);
        lvl19_status = myPreferences.getBoolean(C1_LVL19_STATUS, false);
        lvl20_status = myPreferences.getBoolean(C1_LVL20_STATUS, false);
        lvl21_status = myPreferences.getBoolean(C1_LVL21_STATUS, false);
        lvl22_status = myPreferences.getBoolean(C1_LVL22_STATUS, false);
        lvl23_status = myPreferences.getBoolean(C1_LVL23_STATUS, false);
        lvl24_status = myPreferences.getBoolean(C1_LVL24_STATUS, false);
        lvl25_status = myPreferences.getBoolean(C1_LVL25_STATUS, false);
        lvl26_status = myPreferences.getBoolean(C1_LVL26_STATUS, false);
        lvl27_status = myPreferences.getBoolean(C1_LVL27_STATUS, false);
        lvl28_status = myPreferences.getBoolean(C1_LVL28_STATUS, false);
        lvl29_status = myPreferences.getBoolean(C1_LVL29_STATUS, false);
        lvl30_status = myPreferences.getBoolean(C1_LVL30_STATUS, false);
        lvl31_status = myPreferences.getBoolean(C1_LVL31_STATUS, false);
        lvl32_status = myPreferences.getBoolean(C1_LVL32_STATUS, false);
        lvl33_status = myPreferences.getBoolean(C1_LVL33_STATUS, false);
        lvl34_status = myPreferences.getBoolean(C1_LVL34_STATUS, false);
        lvl35_status = myPreferences.getBoolean(C1_LVL35_STATUS, false);
        lvl36_status = myPreferences.getBoolean(C1_LVL36_STATUS, false);

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

        if(lvl11_status){
            num10.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num10.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl12_status){
            num11.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num11.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl13_status){
            num12.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num12.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl14_status){
            num13.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num13.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl15_status){
            num14.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num14.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl16_status){
            num15.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num15.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl17_status){
            num16.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num16.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl18_status){
            num17.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num17.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl19_status){
            num18.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num18.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl20_status){
            num19.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num19.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl21_status){
            num20.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num20.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl22_status){
            num21.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num21.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl23_status){
            num22.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num22.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl24_status){
            num23.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num23.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl25_status){
            num24.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num24.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl26_status){
            num25.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num25.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl27_status){
            num26.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num26.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl28_status){
            num27.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num27.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl29_status){
            num28.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num28.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl30_status){
            num29.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num29.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl31_status){
            num30.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num30.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl32_status){
            num31.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num31.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl33_status){
            num32.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num32.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl34_status){
            num33.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num33.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl35_status){
            num34.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num34.setImageResource(R.drawable.lvl_lock);
        }

        if(lvl36_status){
            num35.setImageResource(R.drawable.lvl_unlock);
        }
        else{
            num35.setImageResource(R.drawable.lvl_lock);
        }

        num0.setOnClickListener(v -> {
            v.setEnabled(lvl1_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL1_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num0.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level1");
                startActivity(intent);
            }
            else{
                num0.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL1_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num1.setOnClickListener(v -> {
            lvl2_status = lvl1_status;
            v.setEnabled(lvl2_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL2_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num1.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level2");
                startActivity(intent);
            }
            else{
                num1.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL2_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num2.setOnClickListener(v -> {
            lvl3_status = lvl2_status;
            v.setEnabled(lvl3_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL3_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num2.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level3");
                startActivity(intent);
            }
            else{
                num2.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL3_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num3.setOnClickListener(v -> {
            lvl4_status = lvl3_status;
            v.setEnabled(lvl4_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL4_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num3.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level4");
                startActivity(intent);
            }
            else{
                num3.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL4_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num4.setOnClickListener(v -> {
            lvl5_status = lvl4_status;
            v.setEnabled(lvl5_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL5_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num4.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level5");
                startActivity(intent);
            }
            else{
                num4.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL5_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num5.setOnClickListener(v -> {
            lvl6_status = lvl5_status;
            v.setEnabled(lvl6_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL6_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num5.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level6");
                startActivity(intent);
            }
            else{
                num5.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL6_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num6.setOnClickListener(v -> {
            lvl7_status = lvl6_status;
            v.setEnabled(lvl7_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL7_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num6.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level7");
                startActivity(intent);
            }
            else{
                num6.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL7_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num7.setOnClickListener(v -> {
            lvl8_status = lvl7_status;
            v.setEnabled(lvl8_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL8_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num7.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level8");
                startActivity(intent);
            }
            else{
                num7.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL8_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num8.setOnClickListener(v -> {
            lvl9_status = lvl8_status;
            v.setEnabled(lvl9_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL9_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num8.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level9");
                startActivity(intent);
            }
            else{
                num8.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL9_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num9.setOnClickListener(v -> {
            lvl10_status = lvl9_status;
            v.setEnabled(lvl10_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL10_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num9.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level10");
                startActivity(intent);
            }
            else{
                num9.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL10_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num10.setOnClickListener(v -> {
            lvl11_status = lvl10_status;
            v.setEnabled(lvl11_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL11_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num10.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level11");
                startActivity(intent);
            }
            else{
                num10.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL11_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num11.setOnClickListener(v -> {
            lvl12_status = lvl11_status;
            v.setEnabled(lvl12_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL12_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num11.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level12");
                startActivity(intent);
            }
            else{
                num11.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL12_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num12.setOnClickListener(v -> {
            lvl13_status = lvl12_status;
            v.setEnabled(lvl13_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL13_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num12.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level13");
                        startActivity(intent);
            }
            else{
                num12.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL13_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num13.setOnClickListener(v -> {
            lvl14_status = lvl13_status;
            v.setEnabled(lvl14_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL14_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num13.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level14");
                        startActivity(intent);
            }
            else{
                num13.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL14_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num14.setOnClickListener(v -> {
            lvl15_status = lvl14_status;
            v.setEnabled(lvl15_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL15_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num14.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level15");
                        startActivity(intent);
            }
            else{
                num14.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL15_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num15.setOnClickListener(v -> {
            lvl16_status = lvl15_status;
            v.setEnabled(lvl16_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL16_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num15.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level16");
                        startActivity(intent);
            }
            else{
                num15.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL16_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num16.setOnClickListener(v -> {
            lvl17_status = lvl16_status;
            v.setEnabled(lvl17_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL17_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num16.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level17");
                        startActivity(intent);
            }
            else{
                num16.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL17_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num17.setOnClickListener(v -> {
            lvl18_status = lvl17_status;
            v.setEnabled(lvl18_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL18_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num17.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level18");
                        startActivity(intent);
            }
            else{
                num17.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL18_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num18.setOnClickListener(v -> {
            lvl19_status = lvl18_status;
            v.setEnabled(lvl19_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL19_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num18.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level19");
                        startActivity(intent);
            }
            else{
                num18.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL19_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num19.setOnClickListener(v -> {
            lvl20_status = lvl19_status;
            v.setEnabled(lvl20_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL20_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num19.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level20");
                        startActivity(intent);
            }
            else{
                num19.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL20_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num20.setOnClickListener(v -> {
            lvl21_status = lvl20_status;
            v.setEnabled(lvl21_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL21_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num20.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level21");
                        startActivity(intent);
            }
            else{
                num20.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL21_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num21.setOnClickListener(v -> {
            lvl22_status = lvl21_status;
            v.setEnabled(lvl22_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL22_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num21.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level22");
                        startActivity(intent);
            }
            else{
                num21.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL22_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num22.setOnClickListener(v -> {
            lvl23_status = lvl22_status;
            v.setEnabled(lvl23_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL23_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num22.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level23");
                        startActivity(intent);
            }
            else{
                num22.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL23_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num23.setOnClickListener(v -> {
            lvl24_status = lvl23_status;
            v.setEnabled(lvl24_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL24_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num23.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level24");
                        startActivity(intent);
            }
            else{
                num23.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL24_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num24.setOnClickListener(v -> {
            lvl25_status = lvl24_status;
            v.setEnabled(lvl25_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL25_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num24.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level25");
                        startActivity(intent);
            }
            else{
                num24.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL25_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num25.setOnClickListener(v -> {
            lvl26_status = lvl25_status;
            v.setEnabled(lvl26_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL26_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num25.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level26");
                        startActivity(intent);
            }
            else{
                num25.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL26_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num26.setOnClickListener(v -> {
            lvl27_status = lvl26_status;
            v.setEnabled(lvl27_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL27_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num26.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level27");
                        startActivity(intent);
            }
            else{
                num26.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL27_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num27.setOnClickListener(v -> {
            lvl28_status = lvl27_status;
            v.setEnabled(lvl28_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL28_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num27.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level28");
                        startActivity(intent);
            }
            else{
                num27.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL28_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num28.setOnClickListener(v -> {
            lvl29_status = lvl28_status;
            v.setEnabled(lvl29_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL29_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num28.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level29");
                        startActivity(intent);
            }
            else{
                num28.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL29_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num29.setOnClickListener(v -> {
            lvl30_status = lvl29_status;
            v.setEnabled(lvl30_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL30_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num29.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level30");
                        startActivity(intent);
            }
            else{
                num29.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL30_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num30.setOnClickListener(v -> {
            lvl31_status = lvl30_status;
            v.setEnabled(lvl31_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL31_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num30.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level31");
                        startActivity(intent);
            }
            else{
                num30.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL31_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num31.setOnClickListener(v -> {
            lvl32_status = lvl31_status;
            v.setEnabled(lvl32_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL32_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num31.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level32");
                        startActivity(intent);
            }
            else{
                num31.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL32_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num32.setOnClickListener(v -> {
            lvl33_status = lvl32_status;
            v.setEnabled(lvl33_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL33_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num32.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level33");
                        startActivity(intent);
            }
            else{
                num32.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL33_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num33.setOnClickListener(v -> {
            lvl34_status = lvl33_status;
            v.setEnabled(lvl34_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL34_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num33.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level34");
                        startActivity(intent);
            }
            else{
                num33.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL34_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num34.setOnClickListener(v -> {
            lvl35_status = lvl34_status;
            v.setEnabled(lvl35_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL35_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num34.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level35");
                        startActivity(intent);
            }
            else{
                num34.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL35_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });

        num35.setOnClickListener(v -> {
            lvl36_status = lvl35_status;
            v.setEnabled(lvl36_status);
            if(v.isEnabled())
            {
                myEditor.putBoolean(C1_LVL36_STATUS, true);
                myEditor.apply();
                v.setEnabled(true);
                num35.setImageResource(R.drawable.lvl_unlock);
                Intent intent = new Intent(Card1Activity.this, LearnActivity2.class);
                intent.putExtra("cardName", "card1");
                intent.putExtra("levelName", "level36");
                        startActivity(intent);
            }
            else{
                num35.setImageResource(R.drawable.lvl_lock);
                myEditor.putBoolean(C1_LVL36_STATUS, false);
                myEditor.apply();
                v.setEnabled(false);
            }
        });
    }
}