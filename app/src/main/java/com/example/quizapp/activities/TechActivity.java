package com.example.quizapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.quizapp.R;

public class TechActivity extends AppCompatActivity {

    private RadioGroup radioGroupTech;
    private View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        radioGroupTech = findViewById(R.id.radioGroupTechQuiz);
//        layout = findViewById(R.id.layoutTech);

        radioGroupTech.
    }
}