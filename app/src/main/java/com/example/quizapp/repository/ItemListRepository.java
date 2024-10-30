package com.example.quizapp.repository;

import com.example.quizapp.R;
import com.example.quizapp.model.ItemList;
import java.util.ArrayList;
import java.util.List;

public class ItemListRepository {

    public static ArrayList<ItemList> getMockedItemList() {
        ArrayList<ItemList> itemList = new ArrayList<>();

        itemList.add(new ItemList("Filmes e Séries", R.drawable.filme));
        itemList.add(new ItemList("Tecnologias", R.drawable.computacao_em_nuvem));
        itemList.add(new ItemList("Esportes", R.drawable.futebol));

        return itemList;
    }
}