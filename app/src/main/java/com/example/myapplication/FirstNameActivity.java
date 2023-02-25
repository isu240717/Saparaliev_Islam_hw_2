package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FirstNameActivity extends AppCompatActivity {
    private TextView firstNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_name);

        firstNameTextView = findViewById(R.id.firstNameTextView);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("FIRST_NAME");
        firstNameTextView.setText(firstName);
    }
}