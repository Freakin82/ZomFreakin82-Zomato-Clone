package com.freakin.foodorderingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.freakin.foodorderingapp.Adapters.MainAdapter;
import com.freakin.foodorderingapp.Models.MainModel;
import com.freakin.foodorderingapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger, "Burger", "5" , "Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.pizza, "Pizza", "10" , "The offer to download the coupons ends Thursday MAy 20"));
        list.add(new MainModel(R.drawable.pork, "Pork Burger", "12" , "Pizza Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.boca, "Boca Burger", "5",  "Veg Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.burger, "Burger", "5" , "Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.burger, "Pizza Burger", "20" , "Pizza Burger with Extra Cheese"));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }
//my orders menu bar now
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // connecting my orders button to ordersactivity


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this, OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}