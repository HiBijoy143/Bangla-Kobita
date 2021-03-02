package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AA extends AppCompatActivity {
    private ListView aalist;
    String[] plist;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        setTitle("আবিদ আনোয়ার");
        aalist = findViewById(R.id.aalist);
        plist = getResources().getStringArray(R.array.aa);
        adapter = new ArrayAdapter<String>(this,R.layout.poem_list, R.id.poemText,plist);
        aalist.setAdapter(adapter);
        aalist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = plist[i];
                Intent intent = new Intent(AA.this, PoemActivity.class);
                intent.putExtra("pkey", name);
                startActivity(intent);
            }
        });
    }
}