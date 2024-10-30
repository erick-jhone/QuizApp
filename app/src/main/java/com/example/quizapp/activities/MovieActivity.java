package com.example.quizapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import com.example.quizapp.R;

public class MovieActivity extends AppCompatActivity {

    private RadioButton radioButtonPeterCraig, radioButtonPeterJackson, radioButtonPeterParker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_movies);

        radioButtonPeterCraig = findViewById(R.id.radioButtonPeterCraig);
        radioButtonPeterJackson = findViewById(R.id.radioButtonPeterJackson);
        radioButtonPeterParker = findViewById(R.id.radioButtonPeterParker);
    }

    public void onRadioButtonClicked(View view) {
        RadioButton radioButton = (RadioButton) view;

        if(view.getId() == R.id.radioButtonPeterJackson){
            Toast.makeText(this, "Acertou", Toast.LENGTH_LONG).show();
        }

        if(view.getId() == R.id.radioButtonPeterCraig){
            radioButtonPeterCraig.setText("");
        }

        if(view.getId() == R.id.radioButtonPeterParker){
            radioButtonPeterParker.setText("");

        }
    }




}