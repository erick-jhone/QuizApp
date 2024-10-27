package com.example.quizapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

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
        layout = findViewById(R.id.layoutTech);

        radioGroupTech.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton selectedRadioButton = (RadioButton) findViewById(checkedId);
                String selectedText = selectedRadioButton.getText().toString();
                switch (selectedText) {
                    case "Android":
                        Toast.makeText(TechActivity.this, "Acertou", Toast.LENGTH_LONG).show();
                        break;
                    case "Windows":
                        selectedRadioButton.setText("");
                        layout.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    case "IOS":
                        selectedRadioButton.setText("");
                        layout.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                }
            }
        });
    }
}