package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import category.Category;
import category.categoryAdapter;
import food.FOOD;

public class MainActivity extends AppCompatActivity {
private RecyclerView rcvcategory;
private categoryAdapter mcategoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvcategory = findViewById(R.id.rcv_category);
        mcategoryAdapter= new categoryAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvcategory.setLayoutManager(linearLayoutManager);
        mcategoryAdapter.setData(getListCategory());
       rcvcategory.setAdapter(mcategoryAdapter);
    }

    private List<Category> getListCategory() {
        List<Category>list = new ArrayList<>();

        List<FOOD> foodList = new ArrayList<>();
        foodList.add(new FOOD(R.drawable.meme9a,"Food 1"));
        foodList.add(new FOOD(R.drawable.meme10,"Food 2"));
        foodList.add(new FOOD(R.drawable.meme13,"Food 3"));
        foodList.add(new FOOD(R.drawable.meme9a,"Food 4"));
        foodList.add(new FOOD(R.drawable.meme10,"Food 5"));
        foodList.add(new FOOD(R.drawable.meme13,"Food 6"));
        foodList.add(new FOOD(R.drawable.meme9a,"Food 7"));
        foodList.add(new FOOD(R.drawable.meme10,"Food 8"));
        foodList.add(new FOOD(R.drawable.meme13,"Food 9"));
        foodList.add(new FOOD(R.drawable.meme9a,"Food 11"));
        foodList.add(new FOOD(R.drawable.meme10,"Food 12"));
        foodList.add(new FOOD(R.drawable.meme13,"Food 13"));
        foodList.add(new FOOD(R.drawable.meme9a,"Food 14"));
        foodList.add(new FOOD(R.drawable.meme10,"Food 15"));
        foodList.add(new FOOD(R.drawable.meme13,"Food 16"));


        list.add(new Category("FOOD 1",foodList));
        list.add(new Category("FOOD 2",foodList));
        list.add(new Category("FOOD 3",foodList));
        list.add(new Category("FOOD 4",foodList));
        list.add(new Category("FOOD 5",foodList));
        list.add(new Category("FOOD 6",foodList));
        list.add(new Category("FOOD 7",foodList));


        return list;
    }
}