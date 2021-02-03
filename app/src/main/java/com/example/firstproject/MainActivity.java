package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout_intro);
//        TextView textview = new TextView(this);
//        textview.setText("Hello, world!");
//        textview.setTextSize(23);
//        textview.setGravity(Gravity.CENTER);
//        setContentView(textview);

    }
}