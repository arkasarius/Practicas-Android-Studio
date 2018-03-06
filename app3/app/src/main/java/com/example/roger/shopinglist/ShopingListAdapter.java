package com.example.roger.shopinglist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.List;

/**
 * Created by roger on 06/03/2018.
 */

public class ShopingListAdapter extends ArrayAdapter<String> {
    public ShopingListAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //si convertnull es null
        //crear un now view si es necesari, no cal si convertview no es null
        View root =convertView;
        if(convertView == null ){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            root = inflater.inflate(R.layout.shopping_item,parent,false);
        }
        CheckBox checkbox = root.findViewById(R.id.checkBox);
        String item = getItem(position);
        checkbox.setText(item);
        return root;
    }
}
