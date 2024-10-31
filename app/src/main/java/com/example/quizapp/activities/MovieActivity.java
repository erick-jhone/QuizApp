package com.example.quizapp.activities;

import static com.example.quizapp.utils.CorrectAnswersKeys.ANSWER_CORRECT_FOR_DIRECTOR;
import static com.example.quizapp.utils.CorrectAnswersKeys.ANSWER_CORRECT_FOR_HARRY_POTTER;
import static com.example.quizapp.utils.CorrectAnswersKeys.ANSWER_CORRECT_FOR_BREAKING_BAD;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;
import com.example.quizapp.utils.NavigationUtils;
import com.example.quizapp.utils.QuizUtils;

public class MovieActivity extends AppCompatActivity {

    private RadioGroup radioGroupDirector;
    private RadioGroup radioGroupHarryPotter;
    private RadioGroup radioGroupBreakingBad;
    private MovieActivity activityContext;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        activityContext = this;

        initUIComponents();
        setupListeners();
    }

    private void initUIComponents() {
        radioGroupDirector = findViewById(R.id.radioGroupDirector);
        radioGroupHarryPotter = findViewById(R.id.radioGroupHarryPotter);
        radioGroupBreakingBad = findViewById(R.id.radioGroupBreakingBad);
    }

    private void setupListeners() {
        radioGroupDirector.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = findViewById(checkedId);
            String selectedText = selectedRadioButton.getText().toString();
            if (QuizUtils.checkAnswer(activityContext, selectedText, ANSWER_CORRECT_FOR_DIRECTOR)) score++;
            QuizUtils.disableRadioGroup(group);
            checkAllAnsweredAndProceed();
        });

        radioGroupHarryPotter.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = findViewById(checkedId);
            String selectedText = selectedRadioButton.getText().toString();
            if (QuizUtils.checkAnswer(activityContext, selectedText, ANSWER_CORRECT_FOR_HARRY_POTTER)) score++;
            QuizUtils.disableRadioGroup(group);
            checkAllAnsweredAndProceed();
        });

        radioGroupBreakingBad.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = findViewById(checkedId);
            String selectedText = selectedRadioButton.getText().toString();
            if (QuizUtils.checkAnswer(activityContext, selectedText, ANSWER_CORRECT_FOR_BREAKING_BAD)) score++;
            QuizUtils.disableRadioGroup(group);
            checkAllAnsweredAndProceed();
        });
    }

    private void checkAllAnsweredAndProceed() {
        if (isAllQuestionsAnswered()) {
            launchScoreActivity();
        }
    }

    private boolean isAllQuestionsAnswered() {
        return radioGroupDirector.getCheckedRadioButtonId() != -1 &&
                radioGroupHarryPotter.getCheckedRadioButtonId() != -1 &&
                radioGroupBreakingBad.getCheckedRadioButtonId() != -1;
    }

    private void launchScoreActivity() {
        NavigationUtils.navigateAndPop(activityContext, ScoreActivity.class, "score", score);
    }
}