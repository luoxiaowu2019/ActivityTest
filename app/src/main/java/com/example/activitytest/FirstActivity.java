package com.example.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.activitytest.R.layout.layout;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout);

    }
}

