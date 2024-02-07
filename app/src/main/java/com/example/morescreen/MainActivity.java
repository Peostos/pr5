package com.example.morescreen;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] countries = {"Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> madapter;
        madapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        setListAdapter(madapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                {
                    switch (position) {
                        case 0:
                            Intent intent = new Intent(MainActivity.this, Argentina.class);
                            startActivity(intent);
                        break;
                        case 1:
                            Intent intent1 = new Intent(MainActivity.this, Braziliy.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MainActivity.this, Chili.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(MainActivity.this, Kolumbiya.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MainActivity.this, Urugvay.class);
                            startActivity(intent4);
                            break;
                    }
                    Toast.makeText(getApplicationContext(), "Вы выбрали " +
                            parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                }
            }
        };
        getListView().setOnItemClickListener(itemListener);
    }
}