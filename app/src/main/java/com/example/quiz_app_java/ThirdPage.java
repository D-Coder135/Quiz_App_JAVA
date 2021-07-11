package com.example.quiz_app_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ThirdPage extends AppCompatActivity {
    Button nextButton;
    RadioButton firstOption, secondOption, thirdOption, fourthOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        nextButton = findViewById(R.id.button3);
        firstOption = findViewById(R.id.radioButton7);
        secondOption = findViewById(R.id.radioButton8);
        thirdOption = findViewById(R.id.radioButton9);
        fourthOption = findViewById(R.id.radioButton10);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thirdOption.isChecked()) {
                    ++MainActivity.score;
                } else {
                    --MainActivity.score;
                }
                Intent intent = new Intent(ThirdPage.this, ResultPage.class);
                startActivity(intent);
                finish();
            }
        });
    }
}