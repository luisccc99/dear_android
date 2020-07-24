package com.hfad.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class DrinkActivity extends AppCompatActivity {
    public static final String DRINK_NO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        int drinkNo = (int) Objects.requireNonNull
                (getIntent().getExtras()).get(DRINK_NO);

    }
}