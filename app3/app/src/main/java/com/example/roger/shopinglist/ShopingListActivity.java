package com.example.roger.shopinglist;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class ShopingListActivity extends AppCompatActivity {

    private ListView list;
    private ArrayList<String> items;// model de dades
    private ShopingListAdapter adapter;
    private EditText new_item;

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
        new_item=findViewById(R.id.NewItem);
        adapter = new ShopingListAdapter(this,R.layout.shopping_item, items);

        list.setAdapter(adapter);
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                onRemoveItem(position);
                return false;
            }
        });
    }

    private void onRemoveItem(final int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.confirm);
        builder.setMessage(String.format(Locale.getDefault(),"Estàs segur que vols esborrar '%s'",items.get(position)));
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                items.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton(android.R.string.cancel,null);
        builder.create().show();

    }

    public void onAddItem(View view) {
        String item = new_item.getText().toString();
        if(item.isEmpty()){
            Toast.makeText(this, "No has escrit res!", Toast.LENGTH_SHORT).show();
        }else{
         items.add(item);
            adapter.notifyDataSetChanged();
            new_item.setText("");
            list.smoothScrollToPosition(items.size()-1);
        }
    }
}
