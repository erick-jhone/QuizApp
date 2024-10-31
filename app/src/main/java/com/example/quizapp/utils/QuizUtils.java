package com.example.quizapp.utils;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizUtils {

    public static boolean checkAnswer(
            Context context,
            String selectedText,
            String correctAnswer
    ) {

        if (selectedText.equals(correctAnswer)) {
            AppFeedBackUI.showCorrectMessage(context);
            return true;
        }

        AppFeedBackUI.showIncorrectMessage(context);
        return false;
    }

    public static void disableRadioGroup(RadioGroup radioGroup) {
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            View child = radioGroup.getChildAt(i);
            if (child instanceof RadioButton) {
                child.setEnabled(false);
            }
        }
    }
}