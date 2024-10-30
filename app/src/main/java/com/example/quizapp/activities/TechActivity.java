package com.example.quizapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;

public class TechActivity extends AppCompatActivity {

    private RadioGroup radioGroupTech;
    private RadioGroup radioGroupFirstComputer;
    private RadioGroup radioGroupImageToText;
    private View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        radioGroupTech = findViewById(R.id.radioGroupTechQuiz);
        radioGroupFirstComputer = findViewById(R.id.radioGroupFirstComputer);
        radioGroupImageToText = findViewById(R.id.radioGroupImageToText);
        layout = findViewById(R.id.layoutTech);

        radioGroupTech.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                String selectedText = selectedRadioButton.getText().toString();
                switch (selectedText) {
                    case "IOS":
                        Toast.makeText(TechActivity.this, "Acertou!", Toast.LENGTH_LONG).show();
                        break;
                    case "Windows":
                    case "Android":
                        selectedRadioButton.setText("");
                        break;
                }
            }
        });

        radioGroupFirstComputer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                String selectedText = selectedRadioButton.getText().toString();
                switch (selectedText) {
                    case "ENIAC":
                        Toast.makeText(TechActivity.this, "Acertou!", Toast.LENGTH_LONG).show();
                        break;
                    case "UNIVAC":
                    case "IBM PC":
                        selectedRadioButton.setText("");
                        break;
                }
            }
        });

        radioGroupImageToText.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadioButton = findViewById(checkedId);
                String selectedText = selectedRadioButton.getText().toString();
                switch (selectedText) {
                    case "OCR":
                        Toast.makeText(TechActivity.this, "Acertou!", Toast.LENGTH_LONG).show();
                        break;
                    case "AR":
                    case "AI":
                        selectedRadioButton.setText("");
                        break;
                }
            }
        });
    }
}
