package com.example.ftuits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener {
    private ArrayList<String> list;
    private ListView lv;
    private ImageView imageView;

    private ArrayList<Integer>  imageList;
    ArrayAdapter<String> adapter;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.img);
        imageList=new ArrayList<Integer>();
        list=new ArrayList<>();
        list.add("strawberry");
        list.add("banana");
        list.add("apple");
        list.add("watermelon");



    }



    public void showList(View view)
    { adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        lv=findViewById(R.id.lvSimple);
        lv.setOnItemClickListener(this);
        lv.setAdapter(adapter);
        imageList.add(R.drawable.tot);
        imageList.add(R.drawable.img);
        imageList.add(R.drawable.img_1);
        imageList.add(R.drawable.img_2);}

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
        Toast.makeText(this, "Click"+list.get(i), Toast.LENGTH_SHORT).show();
        imageView.setImageResource(imageList.get(i));



    }
}