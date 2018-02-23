package com.andrey_i.homework4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity432 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_432);
    }
    @Override
    public void onBackPressed() {
        finish();
    }
}
