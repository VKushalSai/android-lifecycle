package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
//
//        Button btnStartDialog = findViewById(R.id.btn_start_dialog);
//        btnStartDialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(ActivityC.this, DialogActivity.class));
//            }
//        });
    }

    @Override
    protected void onRestart() {
          super.onRestart();
//        int threadCounter = MainActivity.getThreadCounter();
//        threadCounter += 10;
//        MainActivity.setThreadCounter(threadCounter);
//        Log.d("ActivityC", "OnRestart counter: " + threadCounter);
    }
}
