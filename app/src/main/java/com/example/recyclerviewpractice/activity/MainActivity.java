package com.example.recyclerviewpractice.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerviewpractice.ContactModel;
import com.example.recyclerviewpractice.R;
import com.example.recyclerviewpractice.RecyclerViewContactAdapter;
import com.example.recyclerviewpractice.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    ArrayList<ContactModel>  contactModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        mainBinding.rvContactList.setLayoutManager(new LinearLayoutManager(this));

        contactModelArrayList = new ArrayList<>();


        contactModelArrayList.add(new ContactModel("A","8320577653", R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("B","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("C","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("D","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("E","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("F","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("G","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("H","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("I","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("J","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("K","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("L","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("M","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("O","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("P","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("Q","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("R","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("S","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("T","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("U","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("X","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("Y","8320577653",R.drawable.img_contcat));
        contactModelArrayList.add(new ContactModel("Z","8320577653",R.drawable.img_contcat));

        RecyclerViewContactAdapter adapter = new RecyclerViewContactAdapter(contactModelArrayList);
        mainBinding.rvContactList.setAdapter(adapter);

    }
}