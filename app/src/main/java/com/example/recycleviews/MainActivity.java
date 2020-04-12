package com.example.recycleviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<WishList> Wish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        Wish = new ArrayList<WishList>();

        Wish.add(new WishList("Cupboard", "Rp 3.500.000,-"));
        Wish.add(new WishList("Monitor", "Rp 3.000.000,-"));
        Wish.add(new WishList("Hard Disk", "Rp 1.500.000,-"));
        Wish.add(new WishList("Bag Pack", "Rp 800.000,-"));
        Wish.add(new WishList("SSD", "Rp 2.000.000,-"));
        Wish.add(new WishList("Flash Drive", "Rp 500.000,-"));
        Wish.add(new WishList("Speaker", "Rp 1.000.000,-"));
        Wish.add(new WishList("Keyboard", "Rp 1.300.000,-"));
        Wish.add(new WishList("Mouse", "Rp 800.000,-"));
        Wish.add(new WishList("Room Decorate", "Rp 3.800.000,-"));
        Wish.add(new WishList("Motorcycle", "Rp 28.000.000,-"));



        mAdapter = new myAdapter(this, Wish);
        recyclerView.setAdapter(mAdapter);
    }
}
