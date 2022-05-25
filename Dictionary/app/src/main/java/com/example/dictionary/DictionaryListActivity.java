package com.example.dictionary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class DictionaryListActivity extends AppCompatActivity {
    RecyclerView recyclerViewDictionary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("TEST","5");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary_list);
        //Adapter
        recyclerViewDictionary = findViewById(R.id.recycler_view_dictionary);
        ArrayList<Dictionary> dataSource = (ArrayList<Dictionary>) getIntent().getSerializableExtra("KEY_DICTIONARY_WORD_LIST");
        DictionaryAdapter adapter = new DictionaryAdapter(dataSource);
        recyclerViewDictionary.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewDictionary.setAdapter(adapter);
    }
}