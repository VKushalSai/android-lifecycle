package com.example.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ActivityB;

public class MainActivity extends AppCompatActivity {

    private static int threadCounter = 0;
    Context context = this;
    private int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Button btnStartB = findViewById(R.id.btn_start_b);
//        btnStartB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, ActivityB.class));
//            }
//        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "OnRestart counter: " + threadCounter);
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(""+threadCounter);
    }
    //    public static int getThreadCounter() {
//        return threadCounter;
//
//    }
    public void goToActivityB(View view) {
        threadCounter += 5;
        startActivity(new Intent(MainActivity.this, ActivityB.class));

    }

    public void goToActivityC(View view) {
        threadCounter += 10;
        startActivity(new Intent(MainActivity.this, ActivityC.class));

    }
    public void openDialog(View view) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.activity_dialog);
        dialog.setTitle("Open dialogue");
        dialog.show();
    }
}
