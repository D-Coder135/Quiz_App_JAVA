package com.example.quiz_app_java;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class SecondPage extends AppCompatActivity {
    Button nextButton;
    RadioButton firstOption, secondOption, thirdOption, fourthOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        nextButton = findViewById(R.id.button2);
        firstOption = findViewById(R.id.radioButton3);
        secondOption = findViewById(R.id.radioButton4);
        thirdOption = findViewById(R.id.radioButton5);
        fourthOption = findViewById(R.id.radioButton6);

        nextButton.setOnClickListener(v -> {
            if (fourthOption.isChecked()) {
                ++MainActivity.score;
            } else {
                --MainActivity.score;
            }
            Intent intent = new Intent(SecondPage.this, ThirdPage.class);
            startActivity(intent);
            finish();
        });
    }
}