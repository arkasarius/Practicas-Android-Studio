package com.example.roger.shopinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopingListActivity extends AppCompatActivity {

    private ListView list;
    private ArrayList<String> items;// model de dades
    private ShopingListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping_list);

        items = new ArrayList<>();

        //omplim model de dades amb test items.
        items.add("Patatas");
        items.add("Paper WC");
        items.add("Ketchup");


        list = findViewById(R.id.LLista);

        adapter = new ShopingListAdapter(this,R.layout.shopping_item, items);

        list.setAdapter(adapter);
    }
}
