package com.example.hp1.miralnew1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class cakes extends AppCompatActivity implements AdapterView.OnItemClickListener {

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
        lvcakes.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0 ){
            Intent i = new Intent(this, milkshakes.class);
            startActivity(i);
        }
        if(position == 1){
            Intent i = new Intent(this, cakes.class);
            startActivity(i);
        }

    }
}
