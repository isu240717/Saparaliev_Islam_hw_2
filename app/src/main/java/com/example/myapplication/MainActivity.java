package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstNameEditText;

    private EditText lastNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameEditText = findViewById(R.id.firstNameEditText);
        lastNameEditText = findViewById(R.id.lastNameEditText);

        Button lastNameButton = findViewById(R.id.lastNameButton);
        lastNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lastName = lastNameEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, LastNameActivity.class);
                intent.putExtra("LAST_NAME", lastName);
                startActivity(intent);
            }
        });

        Button firstNameButton = findViewById(R.id.firstNameButton);
        firstNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, FirstNameActivity.class);
                intent.putExtra("FIRST_NAME", firstName);
                startActivity(intent);
            }
        });
    }
}