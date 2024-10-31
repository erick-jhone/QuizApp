package com.example.quizapp.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;
import com.example.quizapp.utils.NavigationUtils;

public class ScoreActivity extends AppCompatActivity {

    private TextView scoreTextView;
    private Button returnHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        initUIComponents();
        displayScore();
        setupReturnButton();
    }

    private void initUIComponents() {
        scoreTextView = findViewById(R.id.scoreTextView);
        returnHomeButton = findViewById(R.id.initNewQuizButton);
    }

    private void displayScore() {
        int score = getIntent().getIntExtra("score", 0);
        scoreTextView.setText("Sua pontuação: " + score);
    }

    private void setupReturnButton() {
        returnHomeButton.setOnClickListener(v -> {
            NavigationUtils.navigateAndPop(ScoreActivity.this, MainActivity.class);
        });
    }
}
