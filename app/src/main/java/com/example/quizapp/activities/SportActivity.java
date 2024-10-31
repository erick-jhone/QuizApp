package com.example.quizapp.activities;

import static com.example.quizapp.utils.CorrectAnswersKeys.ANSWER_CORRECT_FOR_BRAZILIAN_TITLES;
import static com.example.quizapp.utils.CorrectAnswersKeys.ANSWER_CORRECT_FOR_FOUNDATION_YEAR;
import static com.example.quizapp.utils.CorrectAnswersKeys.ANSWER_CORRECT_FOR_TOP_SCORER;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;
import com.example.quizapp.utils.NavigationUtils;
import com.example.quizapp.utils.QuizUtils;

public class SportActivity extends AppCompatActivity {

    private RadioGroup radioGroupFoundationYear;
    private RadioGroup radioGroupBrazilianTitles;
    private RadioGroup radioGroupTopScorer;
    private SportActivity activityContext;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sport);
        activityContext = this;

        initUIComponents();
        setupListeners();
    }

    private void initUIComponents() {
        radioGroupFoundationYear = findViewById(R.id.radioGroupFoundationYear);
        radioGroupBrazilianTitles = findViewById(R.id.radioGroupBrazilianTitles);
        radioGroupTopScorer = findViewById(R.id.radioGroupTopScorer);

    }

    private void setupListeners() {
        radioGroupFoundationYear.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = findViewById(checkedId);
            String selectedText = selectedRadioButton.getText().toString();
            if (QuizUtils.checkAnswer(activityContext, selectedText, ANSWER_CORRECT_FOR_FOUNDATION_YEAR)) score++;
            QuizUtils.disableRadioGroup(group);
            checkAllAnsweredAndProceed();
        });

        radioGroupBrazilianTitles.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = findViewById(checkedId);
            String selectedText = selectedRadioButton.getText().toString();
            if (QuizUtils.checkAnswer(activityContext, selectedText, ANSWER_CORRECT_FOR_BRAZILIAN_TITLES)) score++;
            QuizUtils.disableRadioGroup(group);
            checkAllAnsweredAndProceed();
        });

        radioGroupTopScorer.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = findViewById(checkedId);
            String selectedText = selectedRadioButton.getText().toString();
            if (QuizUtils.checkAnswer(activityContext, selectedText, ANSWER_CORRECT_FOR_TOP_SCORER)) score++;
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
        return radioGroupFoundationYear.getCheckedRadioButtonId() != -1 &&
                radioGroupBrazilianTitles.getCheckedRadioButtonId() != -1 &&
                radioGroupTopScorer.getCheckedRadioButtonId() != -1;
    }

    private void launchScoreActivity() {
        NavigationUtils.navigateAndPop(activityContext, ScoreActivity.class, "score", score);
    }
}