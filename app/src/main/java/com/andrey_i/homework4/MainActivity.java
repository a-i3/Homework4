package com.andrey_i.homework4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button432, button433, button434, buttonPracticum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button432 = (Button)findViewById(R.id.button432);
        button433 = (Button)findViewById(R.id.button433);
        button434 = (Button)findViewById(R.id.button434);
        buttonPracticum = (Button)findViewById(R.id.buttonPracticum);
        button432.setOnClickListener(this);
        button433.setOnClickListener(this);
        button434.setOnClickListener(this);
        buttonPracticum.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent;
        switch (id) {
            case R.id.button432:
                intent = new Intent(MainActivity.this, Activity432.class);
                startActivity(intent);
                break;
            case R.id.button433:
                intent = new Intent(MainActivity.this, Activity433.class);
                startActivity(intent);
                break;
            case R.id.button434:
                intent = new Intent(MainActivity.this, Activity434.class);
                startActivity(intent);
                break;
            case R.id.buttonPracticum:
                intent = new Intent(MainActivity.this, PracticumActivity.class);
                startActivity(intent);
                break;
        }
    }
}
