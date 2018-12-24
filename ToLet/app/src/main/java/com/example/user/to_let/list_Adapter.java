package com.example.user.to_let;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class list_Adapter extends BaseAdapter {
    ArrayList<Item> dataset;
    Context context;
    LayoutInflater inflater;

    public list_Adapter(Context context, ArrayList<Item>dataset) {
        this.context = context;
        this.dataset = dataset;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataset.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = inflater.inflate(R.layout.roommate_wanted, parent, false);
        }
        Holder holder = new Holder(convertView);
        Item item = dataset.get(position);
        holder.textView.setText(item.getName());
        holder.imageView.setImageResource(item.getImageResId());
        return convertView;
    }


    class Holder{
        ImageView imageView;
        TextView textView;
        Button button;
        Holder(View v){
            imageView = v.findViewById(R.id.imageview);
            textView  = v.findViewById(R.id.textview);
            button    = v.findViewById(R.id.button);
        }
    }
}
