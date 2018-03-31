package com.example.anuradha.assig_dynamiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Second_activity extends AppCompatActivity {
    ListView l1;
ArrayList<String> a1=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        l1= (ListView) findViewById(R.id.lv1);
        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,a1);
        l1.setAdapter(ad);
        Bundle b=getIntent().getExtras();

        String h=b.getString("name");
        String i=b.getString("na");
        String j=b.getString("n");
        a1.add(h);
        a1.add(i);
        a1.add(j);
//        a1.add(f);

    }
}
