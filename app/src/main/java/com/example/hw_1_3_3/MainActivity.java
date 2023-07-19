package com.example.hw_1_3_3;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FoodAdapter adapter;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.rv_food);
        loadData();
        adapter = new FoodAdapter(carList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        carList.add("лагман");
        carList.add("пица");
        carList.add("бургер");
        carList.add("шаурма");
        carList.add("четаЕще");
        carList.add("картошка");
        carList.add("фри");
        carList.add("рыба");
        carList.add("рататуй");

    }
}