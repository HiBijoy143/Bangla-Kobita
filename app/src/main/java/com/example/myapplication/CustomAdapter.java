package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] img;
    String[] poet;
    LayoutInflater inflater;
    public CustomAdapter(Context context, int[] img, String[] poet) {
        this.context = context;
        this.poet = poet;
        this.img = img;
    }


    @Override
    public int getCount() {
        return poet.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sample_layout, null,false);
        }

        ImageView icon = view.findViewById(R.id.iconid);
        TextView poetName = view.findViewById(R.id.nameText);

        icon.setImageResource(img[i]);
        poetName.setText(poet[i]);
        return view;
    }
}
