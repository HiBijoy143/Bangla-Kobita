package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    CustomAdapter adapter;
    String[] poet;
    private AlertDialog.Builder alert;

    int[] img = {R.drawable.m1, R.drawable.m1, R.drawable.w1, R.drawable.m1, R.drawable.m1,
            R.drawable.m1,R.drawable.m1,R.drawable.m1,R.drawable.m1,R.drawable.m1,R.drawable.m1,
            R.drawable.m1,R.drawable.w1,R.drawable.w1,R.drawable.m1,R.drawable.m1,R.drawable.m1,
            R.drawable.m1,R.drawable.w1,R.drawable.w1,R.drawable.m1,R.drawable.m1,R.drawable.m1,
            R.drawable.m1,R.drawable.m1,R.drawable.m1,R.drawable.m1,R.drawable.m1,R.drawable.m1,R.drawable.m1,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("বাংলা কবিতা");
        listView = findViewById(R.id.listviewId);
        poet = getResources().getStringArray(R.array.poetName);
        adapter = new CustomAdapter(MainActivity.this,img,poet);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
                String value = poet[i];
                if(value.equals("আহসান হাবিব"))
                {
                    Intent intent = new Intent(MainActivity.this,AH.class);
                    startActivity(intent);
                }
                else if(value.equals("আসাদ চৌধুরী"))
                {
                    Intent intent = new Intent(MainActivity.this,AC.class);
                    startActivity(intent);
                }
                else if(value.equals("কামিনী রায়"))
                {
                    Intent intent = new Intent(MainActivity.this,KR.class);
                    startActivity(intent);
                }
                else if(value.equals("জসিমউদ্দিন"))
                {
                    Intent intent = new Intent(MainActivity.this,JU.class);
                    startActivity(intent);
                }
                else if(value.equals("জীবনানন্দ দাশ"))
                {
                    Intent intent = new Intent(MainActivity.this,JD.class);
                    startActivity(intent);
                }
                else if(value.equals("কাজী নজরুল ইসলাম"))
                {
                    Intent intent = new Intent(MainActivity.this,KNI.class);
                    startActivity(intent);
                }
                else if(value.equals("খোন্দকার আশরাফ হোসেন"))
                {
                    Intent intent = new Intent(MainActivity.this,KAH.class);
                    startActivity(intent);
                }
                else if(value.equals("রবীন্দ্রনাথ ঠাকুর"))
                {
                    Intent intent = new Intent(MainActivity.this,RNT.class);
                    startActivity(intent);
                }
                else if(value.equals("মাইকেল মধুসূদন দত্ত"))
                {
                    Intent intent = new Intent(MainActivity.this,MMD.class);
                    startActivity(intent);
                }
                else if(value.equals("রুদ্র মোহাম্মদ শহীদুল্লাহ"))
                {
                    Intent intent = new Intent(MainActivity.this,RMS.class);
                    startActivity(intent);
                }
                else if(value.equals("শামসুর রহমান"))
                {
                    Intent intent = new Intent(MainActivity.this,SR.class);
                    startActivity(intent);
                }
                else if(value.equals("নির্মলেন্দু গুণ"))
                {
                    Intent intent = new Intent(MainActivity.this,NG.class);
                    startActivity(intent);
                }
                else if(value.equals("সুফিয়া কামাল"))
                {
                    Intent intent = new Intent(MainActivity.this,SK.class);
                    startActivity(intent);
                }
                else if(value.equals("তসলিমা নাসরিন"))
                {
                    Intent intent = new Intent(MainActivity.this,TN.class);
                    startActivity(intent);
                }
                else if(value.equals("সত্যেন্দ্রনাথ দত্ত"))
                {
                    Intent intent = new Intent(MainActivity.this,SD.class);
                    startActivity(intent);
                }
                else if(value.equals("সুকান্ত ভট্টাচার্য"))
                {
                    Intent intent = new Intent(MainActivity.this,SV.class);
                    startActivity(intent);
                }
                else if(value.equals("সুকুমার রায়"))
                {
                    Intent intent = new Intent(MainActivity.this,SUR.class);
                    startActivity(intent);
                }
                else if(value.equals("সৈয়দ শামসুল হক"))
                {
                    Intent intent = new Intent(MainActivity.this,SSH.class);
                    startActivity(intent);
                }
                else if(value.equals("রাধারানী দেবী"))
                {
                    Intent intent = new Intent(MainActivity.this,RD.class);
                    startActivity(intent);
                }
                else if(value.equals("কায়কোবাদ"))
                {
                    Intent intent = new Intent(MainActivity.this,KKB.class);
                    startActivity(intent);
                }
                else if(value.equals("কাজী কাদের নেওয়াজ"))
                {
                    Intent intent = new Intent(MainActivity.this,KKN.class);
                    startActivity(intent);
                }
                else if(value.equals("ঈশ্বরচন্দ্র গুপ্ত"))
                {
                    Intent intent = new Intent(MainActivity.this,IG.class);
                    startActivity(intent);
                }
                else if(value.equals("অসীম সাহা"))
                {
                    Intent intent = new Intent(MainActivity.this,OS.class);
                    startActivity(intent);
                }
                else if(value.equals("আবিদ আনোয়ার"))
                {
                    Intent intent = new Intent(MainActivity.this,AA.class);
                    startActivity(intent);
                }
                else if(value.equals("শক্তি চট্টোপাধ্যায়"))
                {
                    Intent intent = new Intent(MainActivity.this,SC.class);
                    startActivity(intent);
                }
                else if(value.equals("হেলাল হাফিজ"))
                {
                    Intent intent = new Intent(MainActivity.this,HH.class);
                    startActivity(intent);
                }
                else if(value.equals("মোহাম্মদ রফিকউজ্জামান"))
                {
                    Intent intent = new Intent(MainActivity.this,MR.class);
                    startActivity(intent);
                }
                else if(value.equals("বিমল মণ্ডল"))
                {
                    Intent intent = new Intent(MainActivity.this,BM.class);
                    startActivity(intent);
                }
                else if(value.equals("মোঃ বুলবুল হোসেন"))
                {
                    Intent intent = new Intent(MainActivity.this,MBH.class);
                    startActivity(intent);
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        alert = new AlertDialog.Builder(MainActivity.this);
        //set icon
        alert.setIcon(R.drawable.exit);
        //set Title
        alert.setTitle("Warning!");
        //set Message
        alert.setMessage("Do you want to Exit?");
        //set Positive button

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alert.setCancelable(false);
        AlertDialog alertDialog = alert.create();
        alert.show();
        //super.onBackPressed();
    }
}