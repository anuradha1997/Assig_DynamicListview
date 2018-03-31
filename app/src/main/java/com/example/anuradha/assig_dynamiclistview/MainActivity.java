package com.example.anuradha.assig_dynamiclistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2;
    ListView l1;

    ArrayList<String> list1=new ArrayList<String>();
//    ArrayList<String> list2=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1= (EditText) findViewById(R.id.eg1);
        e2= (EditText) findViewById(R.id.eg2);
        e3= (EditText) findViewById(R.id.eg3);
        b1= (Button) findViewById(R.id.bg1);
        b2= (Button) findViewById(R.id.bg2);
        l1= (ListView) findViewById(R.id.lg1);
        final ArrayAdapter<String> a=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list1);
//        ArrayAdapter<String> b=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list2);
        l1.setAdapter(a);
          b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i=new Intent(MainActivity.this,Second_activity.class);
                final String s1=e1.getText().toString();
                final String s2=e2.getText().toString();
                final String s3=e3.getText().toString();
//                if(s1.equals(""))
//                    e1.setError("Write orrect value");
                    list1.add(s1);
                     list1.add(s2);
                   list1.add(s3);
                e1.setText("");
                e2.setText("");
                e3.setText("");
                a.notifyDataSetChanged();
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1=new Intent(MainActivity.this,Second_activity.class);
                        i1.putExtra("name",s1);
                        i1.putExtra("na",s2);
                        i1.putExtra("n",s3);
                        a.notifyDataSetChanged();
                        startActivity(i1);

                    }
                });

            }
        });

    }
}
