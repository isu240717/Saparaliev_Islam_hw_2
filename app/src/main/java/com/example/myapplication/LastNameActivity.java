package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LastNameActivity extends AppCompatActivity {
    private TextView lastNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_name);

        lastNameTextView = findViewById(R.id.lastNameTextView);

        Intent intent = getIntent();
        String lastName = intent.getStringExtra("LAST_NAME");
        lastNameTextView.setText(lastName);
    }
}