package com.example.quiz_app_java;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultPage extends AppCompatActivity {
    TextView resultView;
    Button startOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);
        resultView = findViewById(R.id.textView4);
        startOver = findViewById(R.id.button4);

        resultView.setText("Your Final Score Is = " +MainActivity.score);

        startOver.setOnClickListener(v -> {
            Intent intent = new Intent(ResultPage.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}