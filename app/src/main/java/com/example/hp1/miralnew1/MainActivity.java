package com.example.hp1.miralnew1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener{

   Button btshakes,btcakes; // 1 lal shakes w 2 lal cakes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btshakes=(Button)findViewById(R.id.btshakes);
        btshakes.setOnClickListener(this);

        btcakes=(Button)findViewById(R.id.btcakes);
        btcakes.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v == btshakes) {
            Intent i = new Intent(this, milkshakes.class);
            startActivity(i);
        }
        if (v == btcakes) {
            Intent i = new Intent(this, cakes.class);
            startActivity(i);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){
            Intent i=new Intent(this, milkshakes.class);
            startActivity(i);
        }
    }
}
