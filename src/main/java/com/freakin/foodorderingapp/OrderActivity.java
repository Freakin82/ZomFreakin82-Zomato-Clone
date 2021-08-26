package com.freakin.foodorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.freakin.foodorderingapp.Adapters.OrdersAdapter;
import com.freakin.foodorderingapp.Models.OrdersModel;
import com.freakin.foodorderingapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        DBHelper helper= new DBHelper(this);
        ArrayList<OrdersModel> list= helper.getOrders();


        OrdersAdapter adapter = new OrdersAdapter(list, this);
        binding.ordersRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager =  new LinearLayoutManager(this);
        binding.ordersRecyclerView.setLayoutManager(layoutManager);

    }
}