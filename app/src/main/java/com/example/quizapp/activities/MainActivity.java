package com.example.quizapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;
import com.example.quizapp.adapters.ItemListAdapter;
import com.example.quizapp.model.ItemList;
import com.example.quizapp.repository.ItemListRepository;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemClickListener {
    private ListView listViewQuizOptions;
    private ItemListAdapter adapter;
    private ArrayList<ItemList> items;

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
        items = ItemListRepository.getMockedItemList();
        adapter = new ItemListAdapter(this, items);
        listViewQuizOptions.setAdapter(adapter);
        listViewQuizOptions.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       ItemList item = (ItemList) parent.getItemAtPosition(position);
       openScreen(item.getData());
    }

    private void openScreen(String item) {
        Intent intent;

        switch(item){
            case "Filmes e Séries":
                intent = new Intent(MainActivity.this, MovieActivity.class);
                startActivity(intent);
                break;
            case "Tecnologias":
                intent = new Intent(MainActivity.this, TechActivity.class);
                startActivity(intent);
                break;
            case "Esportes":
                intent = new Intent(MainActivity.this, SportActivity.class);
                startActivity(intent);
                break;
        }
    }
}