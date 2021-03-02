package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KR extends AppCompatActivity {
    private ListView krlist;
    String[] plist;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_r);
        setTitle("কামিনী রায়");
        krlist = findViewById(R.id.krlist);
        plist = getResources().getStringArray(R.array.kr);
        adapter = new ArrayAdapter<String>(this,R.layout.poem_list, R.id.poemText,plist);
        krlist.setAdapter(adapter);
        krlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = plist[i];
                Intent intent = new Intent(KR.this, PoemActivity.class);
                intent.putExtra("pkey", name);
                startActivity(intent);
            }
        });
    }
}