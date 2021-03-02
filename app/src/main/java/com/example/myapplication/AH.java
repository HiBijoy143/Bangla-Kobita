package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AH extends AppCompatActivity {
    private ListView ahlist;
    String[] plist;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_h);
        setTitle("আহসান হাবিব");
        ahlist = findViewById(R.id.ahlist);
        plist = getResources().getStringArray(R.array.ah);
        adapter = new ArrayAdapter<String>(this,R.layout.poem_list, R.id.poemText,plist);
        ahlist.setAdapter(adapter);
        ahlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = plist[i];
                Intent intent = new Intent(AH.this, PoemActivity.class);
                intent.putExtra("pkey", name);
                startActivity(intent);
            }
        });
    }
}