package com.example.quizapp.adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quizapp.R;
import com.example.quizapp.model.ItemList;

import java.util.ArrayList;

public class ItemListAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<ItemList> items;

    public ItemListAdapter(Context context, ArrayList<ItemList> items) {
        this.items = items;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public ItemList getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemList item = items.get(position);
        convertView = inflater.inflate(R.layout.item_list, null);
        TextView text = convertView.findViewById(R.id.textViewItemList);
        text.setText(item.getData());
        ImageView image = convertView.findViewById(R.id.imageItemList);
        image.setImageResource(item.getImage());
        return convertView;
    }
}
