package com.example.hp1.miralnew1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class cakes extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    ListView lvcakes;//3rfna 3list view
    ArrayAdapter<String> adapter;
    ArrayList<String> arrcakes=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakes);

        lvcakes=(ListView) findViewById(R.id.lvMyCakes);

        arrcakes.add("Chees_cake");
        arrcakes.add("Orange_cake");
        arrcakes.add("Chocolate_cake");

        adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,arrcakes);
        lvcakes.setAdapter(adapter);
        lvcakes.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


    }
}
