package com.hadimusthafa.recyclerview;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MyAdapter myAdapter;
    private RecyclerView recyclerView;

    String[] a = new String[]{"1", "2", "3", "4", "5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        ArrayList arrayList = new ArrayList();

        MyModel myModel = new MyModel();
        myModel.setResult(a[0]);
        arrayList.add(myModel);

        MyModel myModel1 = new MyModel();
        myModel1.setResult(a[1]);
        arrayList.add(myModel1);

        if (arrayList.size() > 0) {
            myAdapter = new MyAdapter(this, arrayList);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        } else {
            recyclerView.setVisibility(View.GONE);
        }
    }
}