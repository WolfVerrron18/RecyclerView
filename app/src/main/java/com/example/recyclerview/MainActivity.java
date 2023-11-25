package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();

        recyclerViewItems.add(new RecyclerViewItem(R.drawable.wc_24, "WC", "Парень и девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.woman_24, "Woman", "Девушка"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.man_24, "Man", "Парень"));
    }
}