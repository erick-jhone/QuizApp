package com.example.quizapp.model;

import java.util.ArrayList;
import java.util.List;

public class Option {


    public static List<String> listOptions(){
        List<String> listOptions = new ArrayList<>();
        listOptions.add("Filmes");
        listOptions.add("Tecnologias");
        listOptions.add("Esportes");
        return listOptions;
    }
}
