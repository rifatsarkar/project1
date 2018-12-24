package com.example.user.to_let;

import android.app.LauncherActivity;
import android.content.ClipData;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class roommate_wanted extends AppCompatActivity {
    ListView listView;
    String[] strings = { "mess", "Flat", "Office", "Car", "Comercial", "Land",
    };

    ArrayList<Item>dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roommate_wanted);
        listView = findViewById(R.id.list);
        initData();
        list_Adapter ListAdapter = new list_Adapter(this, dataList);
        listView.setAdapter(ListAdapter);
        //ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item,strings);
       // listView.setAdapter(arrayAdapter);
    }

    void initData(){
        dataList = new ArrayList<>();
        dataList.add(new Item(R.drawable.bed,"Mess"));
        dataList.add(new Item(R.drawable.flat,"Flat"));
        dataList.add(new Item(R.drawable.office,"Office"));

    }

}
