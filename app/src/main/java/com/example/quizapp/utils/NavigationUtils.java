package com.example.quizapp.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class NavigationUtils {

    public static final String NAVIGATION_KEY_MOVIES_AND_SERIES = "Filmes e Séries";
    public static final String NAVIGATION_KEY_TECH = "Tecnologias";
    public static final String NAVIGATION_KEY_SPORT = "Esportes";

    public static void navigate(Context context, Class<?> destination) {
        Intent intent = new Intent(context, destination);
        context.startActivity(intent);
    }

    public static void navigateAndPop(Context context, Class<?> destination, String key, int value) {
        Intent intent = new Intent(context, destination);
        intent.putExtra(key, value);
        context.startActivity(intent);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public static void navigateAndPop(Context context, Class<?> destination) {
        Intent intent = new Intent(context, destination);
        context.startActivity(intent);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }
}