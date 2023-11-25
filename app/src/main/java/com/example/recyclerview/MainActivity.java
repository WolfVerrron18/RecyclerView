package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();

        recyclerViewItems.add(new RecyclerViewItem(R.drawable.wc_24, "WC", "Парень и девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.woman_24, "Woman", "Девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.man_24, "Man", "Парень"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.wc_24, "WC", "Парень и девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.woman_24, "Woman", "Девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.man_24, "Man", "Парень"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.wc_24, "WC", "Парень и девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.woman_24, "Woman", "Девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.man_24, "Man", "Парень"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.wc_24, "WC", "Парень и девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.woman_24, "Woman", "Девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.man_24, "Man", "Парень"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.wc_24, "WC", "Парень и девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.woman_24, "Woman", "Девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.man_24, "Man", "Парень"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.wc_24, "WC", "Парень и девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.woman_24, "Woman", "Девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.man_24, "Man", "Парень"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.wc_24, "WC", "Парень и девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.woman_24, "Woman", "Девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.man_24, "Man", "Парень"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecycleViewAdapter(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}