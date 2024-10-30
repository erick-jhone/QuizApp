package com.example.quizapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class SportActivity extends AppCompatActivity {

    private RadioGroup radioGroupFoundationYear;
    private RadioGroup radioGroupBrazilianTitles;
    private RadioGroup radioGroupTopScorer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sport);

        radioGroupFoundationYear = findViewById(R.id.radioGroupFoundationYear);
        radioGroupBrazilianTitles = findViewById(R.id.radioGroupBrazilianTitles);
        radioGroupTopScorer = findViewById(R.id.radioGroupTopScorer);

        setupListeners();
    }

    private void setupListeners() {
        radioGroupFoundationYear.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                String selectedText = selectedRadioButton.getText().toString();
                if (selectedText.equals("1910")) {
                    Toast.makeText(SportActivity.this, "Acertou!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(SportActivity.this, "Errado!", Toast.LENGTH_LONG).show();
                }
            }
        });

        radioGroupBrazilianTitles.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                String selectedText = selectedRadioButton.getText().toString();
                if (selectedText.equals("7")) {
                    Toast.makeText(SportActivity.this, "Acertou!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(SportActivity.this, "Errado!", Toast.LENGTH_LONG).show();
                }
            }
        });

        radioGroupTopScorer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                String selectedText = selectedRadioButton.getText().toString();
                if (selectedText.equals("Ronaldo Fenômeno")) {
                    Toast.makeText(SportActivity.this, "Acertou!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(SportActivity.this, "Errado!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
