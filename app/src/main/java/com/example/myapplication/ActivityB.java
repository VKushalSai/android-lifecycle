package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
//
//        Button btnStartC = findViewById(R.id.btn_start_c);
//        btnStartC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(ActivityB.this, ActivityC.class));
//            }
//        });
    }
    @Override
    protected void onRestart() {
        super.onRestart();
//        int threadCounter = MainActivity.getThreadCounter();
//        threadCounter += 5;
//        MainActivity.setThreadCounter(threadCounter);
//        Log.d("ActivityB", "OnRestart counter: " + threadCounter);
    }
}