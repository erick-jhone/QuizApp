package com.example.quizapp.activities;

import static com.example.quizapp.utils.NavigationUtils.NAVIGATION_KEY_MOVIES_AND_SERIES;
import static com.example.quizapp.utils.NavigationUtils.NAVIGATION_KEY_SPORT;
import static com.example.quizapp.utils.NavigationUtils.NAVIGATION_KEY_TECH;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quizapp.R;
import com.example.quizapp.adapters.ItemListAdapter;
import com.example.quizapp.model.ItemList;
import com.example.quizapp.data.ItemListRepository;
import com.example.quizapp.utils.NavigationUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemClickListener {
    private ListView listViewQuizOptions;
    private ItemListAdapter adapter;
    private ArrayList<ItemList> items;
    private MainActivity activityContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listViewQuizOptions = findViewById(R.id.listViewQuizOptions);
        activityContext = this;
        makeAdapter();
        listViewQuizOptions.setAdapter(adapter);

    }

    private void makeAdapter(){
        items = ItemListRepository.getItemList();
        adapter = new ItemListAdapter(this, items);
        listViewQuizOptions.setAdapter(adapter);
        listViewQuizOptions.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       ItemList item = (ItemList) parent.getItemAtPosition(position);
       openScreen(item.getData());
    }

    private void openScreen(String quizCategory) {
        switch(quizCategory) {
            case NAVIGATION_KEY_MOVIES_AND_SERIES:
                NavigationUtils.navigate(activityContext, MovieActivity.class);
                break;
            case NAVIGATION_KEY_TECH:
                NavigationUtils.navigate(activityContext, TechActivity.class);
                break;
            case NAVIGATION_KEY_SPORT:
                NavigationUtils.navigate(activityContext, SportActivity.class);
                break;
        }
    }
}