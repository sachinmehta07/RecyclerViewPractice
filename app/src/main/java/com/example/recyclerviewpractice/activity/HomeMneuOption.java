package com.example.recyclerviewpractice.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recyclerviewpractice.MenuItemModel;
import com.example.recyclerviewpractice.R;
import com.example.recyclerviewpractice.RecyclerViewMenuAdapter;
import com.example.recyclerviewpractice.databinding.ActivityHomeMneuOptionBinding;

import java.util.ArrayList;

public class HomeMneuOption extends AppCompatActivity {

    ActivityHomeMneuOptionBinding mneuOptionBinding;

    ArrayList<MenuItemModel> itemModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mneuOptionBinding = ActivityHomeMneuOptionBinding.inflate(getLayoutInflater());
        setContentView(mneuOptionBinding.getRoot());

        itemModelArrayList = new ArrayList<>();

        itemModelArrayList.add(new MenuItemModel(R.drawable.ic_launcher_foreground,"HOME","ALL ITEM IS HERE"));
        itemModelArrayList.add(new MenuItemModel(R.drawable.ic_launcher_foreground,"PROFILE","ALL ITEM IS HERE"));
        itemModelArrayList.add(new MenuItemModel(R.drawable.ic_launcher_foreground,"SETING","ALL ITEM IS HERE"));
        itemModelArrayList.add(new MenuItemModel(R.drawable.ic_launcher_foreground,"ABOUT","ALL ITEM IS HERE"));
        itemModelArrayList.add(new MenuItemModel(R.drawable.ic_launcher_foreground,"HELP","ALL ITEM IS HERE"));
        itemModelArrayList.add(new MenuItemModel(R.drawable.ic_launcher_foreground,"CENTER","ALL ITEM IS HERE"));
        itemModelArrayList.add(new MenuItemModel(R.drawable.ic_launcher_foreground,"MY CASE","ALL ITEM IS HERE"));
        itemModelArrayList.add(new MenuItemModel(R.drawable.ic_launcher_foreground,"ORDERS","ALL ITEM IS HERE"));
        itemModelArrayList.add(new MenuItemModel(R.drawable.ic_launcher_foreground,"BILLS","ALL ITEM IS HERE"));

        RecyclerViewMenuAdapter menuAdapter = new RecyclerViewMenuAdapter(itemModelArrayList);
        mneuOptionBinding.rvMneuItemList.setAdapter(menuAdapter);

    }
}