package com.example.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.quizapp.model.Option;

import java.util.List;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemClickListener {
    private ListView listViewQuizOptions;
    private ArrayAdapter adapter;
    private List<String> listOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listViewQuizOptions = findViewById(R.id.listViewQuizOptions);
        makeAdapter();
        listViewQuizOptions.setAdapter(adapter);


    }

    private void makeAdapter(){
        listOptions = Option.listOptions();
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
//        openScreen(item);
    }
}