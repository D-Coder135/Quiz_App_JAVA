package com.example.quiz_app_java;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button nextButton;
    RadioButton firstOption, secondOption;
    static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextButton = findViewById(R.id.button);
        firstOption = findViewById(R.id.radioButton);
        secondOption = findViewById(R.id.radioButton2);

        nextButton.setOnClickListener(v -> {
            score = 0;
            if (firstOption.isChecked()) {
                ++score;
            } else {
                --score;
            }
            Intent intent = new Intent(MainActivity.this, SecondPage.class);
            startActivity(intent);
            finish();
        });
    }
}