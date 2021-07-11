package com.example.quiz_app_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

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

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fourthOption.isChecked()) {
                    ++MainActivity.score;
                }
            }
        });
    }
}