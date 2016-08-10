package com.example.admin.listdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Button ascending, descending;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.lv);
        ascending=(Button)findViewById(R.id.asc);
        descending=(Button)findViewById(R.id.desc);
        final String[] rand= new String[]{"Attitude", "Bright", "Clever", "Dovetail", "Earnest", "Fear", "Growth", "Humble", "Item", "Joke", "Kind"};
        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,rand);
        list.setAdapter(adapter);

        ascending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arrays.sort(rand);
                adapter.notifyDataSetChanged();
            }
        });

        descending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arrays.sort(rand);
                Arrays.sort(rand, Collections.reverseOrder());
                adapter.notifyDataSetChanged();
            }
        });
    }
}
