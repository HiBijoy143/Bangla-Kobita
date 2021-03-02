package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PoemActivity extends AppCompatActivity {

    TextView pName, poem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
        pName = findViewById(R.id.poemNameId);
        poem = findViewById(R.id.poemId);

        String name = getIntent().getStringExtra("pkey");

        if(name.equals("১৪০০ সাল"))
        {
            setTitle("আবিদ আনোয়ার");
            pName.setText(name+"");
            poem.setText(R.string.aa1);
        }
        else if(name.equals("অভিযাত্রীর খেরোখাতা"))
        {
            setTitle("আবিদ আনোয়ার");
            pName.setText(name+"");
            poem.setText(R.string.aa2);
        }
        else if(name.equals("অ্যাকুরিয়াম"))
        {
            setTitle("আবিদ আনোয়ার");
            pName.setText(name+"");
            poem.setText(R.string.aa3);
        }
        else if(name.equals("আমি কার খালু"))
        {
            setTitle("আবিদ আনোয়ার");
            pName.setText(name+"");
            poem.setText(R.string.aa4);
        }
        else if(name.equals("ঈগল ও ঈশ্বর"))
        {
            setTitle("আবিদ আনোয়ার");
            pName.setText(name+"");
            poem.setText(R.string.aa5);
        }
        else if(name.equals("উত্তরাধুনিক বৃষ্টিপাত"))
        {
            setTitle("আবিদ আনোয়ার");
            pName.setText(name+"");
            poem.setText(R.string.aa6);
        }
        else if(name.equals("এক উলুঝুলু চিত্রকরকে দেখে"))
        {
            setTitle("আবিদ আনোয়ার");
            pName.setText(name+"");
            poem.setText(R.string.aa7);
        }

        else if(name.equals("ক্লাসের অবসরে"))
        {
            setTitle("আহসান হাবিব");
            pName.setText(name+"");
            poem.setText(R.string.ah1);
        }
        else if(name.equals("কল্পনায় আল্পনা"))
        {
            setTitle("আহসান হাবিব");
            pName.setText(name+"");
            poem.setText(R.string.ah2);
        }
        else if(name.equals("বিজয়ের গান"))
        {
            setTitle("আহসান হাবিব");
            pName.setText(name+"");
            poem.setText(R.string.ah3);
        }

        else if(name.equals("তবক দেওয়া পান"))
        {
            setTitle("আসাদ চৌধুরী");
            pName.setText(name+"");
            poem.setText(R.string.ac1);
        }
        else if(name.equals("বজলশূন্য নদী"))
        {
            setTitle("আসাদ চৌধুরী");
            pName.setText(name+"");
            poem.setText(R.string.ac2);
        }
        else if(name.equals("আমার চোখে অনেক দুপুর"))
        {
            setTitle("আসাদ চৌধুরী");
            pName.setText(name+"");
            poem.setText(R.string.ac3);
        }

        else if(name.equals("করনা জিজ্ঞাসা"))
        {
            setTitle("কামিনী রায়ী");
            pName.setText(name+"");
            poem.setText(R.string.ac1);
        }
        else if(name.equals("পাছে লোকে কিছু বলে"))
        {
            setTitle("কামিনী রায়");
            pName.setText(name+"");
            poem.setText(R.string.ac2);
        }
        else if(name.equals("এরা যদি জানে"))
        {
            setTitle("কামিনী রায়ী");
            pName.setText(name+"");
            poem.setText(R.string.kr3);
        }
    }
}