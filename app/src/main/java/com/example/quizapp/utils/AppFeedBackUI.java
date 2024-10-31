package com.example.quizapp.utils;

import android.content.Context;
import android.widget.Toast;

public class AppFeedBackUI {

    private AppFeedBackUI(){

    }

    public static void showCorrectMessage(Context context) {
        Toast.makeText(context, "Correto", Toast.LENGTH_SHORT).show();
    }

    public static void showIncorrectMessage(Context context){
        Toast.makeText(context, "Incorreto", Toast.LENGTH_SHORT).show();
    }
}
