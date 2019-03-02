package com.example.goni.busscheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener  {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    String[] Bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listViewId);

        Bus = getResources().getStringArray(R.array.Bus);
        adapter = new ArrayAdapter<>(MainActivity.this,R.layout.sample,R.id.textViewId,Bus);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        if(i==0){
            Intent intent = new Intent(view.getContext(), student.class);
            startActivityForResult(intent,0);
        }
        if(i==1){
            Intent intent = new Intent(view.getContext(), teacher.class);
            startActivityForResult(intent,1);
        }
        if(i==2){
            Intent intent = new Intent(view.getContext(), stuff.class);
            startActivityForResult(intent,2);
        }


    }
}










