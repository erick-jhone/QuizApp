package com.example.quizapp.activities;

import static com.example.quizapp.utils.CorrectAnswersKeys.ANSWER_CORRECT_FOR_FIRST_COMPUTER;
import static com.example.quizapp.utils.CorrectAnswersKeys.ANSWER_CORRECT_FOR_IMAGE_TO_TEXT;
import static com.example.quizapp.utils.CorrectAnswersKeys.ANSWER_CORRECT_FOR_OS_APPLE;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;
import com.example.quizapp.utils.NavigationUtils;
import com.example.quizapp.utils.QuizUtils;

public class TechActivity extends AppCompatActivity {

    private RadioGroup radioGroupTech;
    private RadioGroup radioGroupFirstComputer;
    private RadioGroup radioGroupImageToText;
    private TechActivity activityContext;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        activityContext = this;

        initUIComponents();
        setupListeners();
    }

    private void initUIComponents() {
        radioGroupTech = findViewById(R.id.radioGroupTechQuiz);
        radioGroupFirstComputer = findViewById(R.id.radioGroupFirstComputer);
        radioGroupImageToText = findViewById(R.id.radioGroupImageToText);
    }

    private void setupListeners() {
        radioGroupTech.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = findViewById(checkedId);
            String selectedText = selectedRadioButton.getText().toString();
            if (QuizUtils.checkAnswer(activityContext, selectedText, ANSWER_CORRECT_FOR_OS_APPLE)) score++;
            QuizUtils.disableRadioGroup(group);
            checkAllAnsweredAndProceed();
        });

        radioGroupFirstComputer.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = findViewById(checkedId);
            String selectedText = selectedRadioButton.getText().toString();
            if (QuizUtils.checkAnswer(activityContext, selectedText, ANSWER_CORRECT_FOR_FIRST_COMPUTER)) score++;
            QuizUtils.disableRadioGroup(group);
            checkAllAnsweredAndProceed();
        });

        radioGroupImageToText.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = findViewById(checkedId);
            String selectedText = selectedRadioButton.getText().toString();
            if (QuizUtils.checkAnswer(activityContext, selectedText, ANSWER_CORRECT_FOR_IMAGE_TO_TEXT)) score++;
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
        return radioGroupTech.getCheckedRadioButtonId() != -1 &&
                radioGroupFirstComputer.getCheckedRadioButtonId() != -1 &&
                radioGroupImageToText.getCheckedRadioButtonId() != -1;
    }

    private void launchScoreActivity() {
        NavigationUtils.navigateAndPop(activityContext, ScoreActivity.class, "score", score);
    }
}