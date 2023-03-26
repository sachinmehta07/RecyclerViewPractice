package com.example.recyclerviewpractice.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recyclerviewpractice.PersonDetailsModel;
import com.example.recyclerviewpractice.RecyclerViewPersonDetailsAdapter;
import com.example.recyclerviewpractice.databinding.ActivityMainDashBoardBinding;

import java.util.ArrayList;

public class MainDashBoard extends AppCompatActivity {

    ActivityMainDashBoardBinding dashBoardBinding;

    ArrayList<PersonDetailsModel> personDetailsModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dashBoardBinding = ActivityMainDashBoardBinding.inflate(getLayoutInflater());
        setContentView(dashBoardBinding.getRoot());

        personDetailsModelArrayList = new ArrayList<>();

        personDetailsModelArrayList.add(new PersonDetailsModel("SACHIN","MEHTA","ANDROID"));
        personDetailsModelArrayList.add(new PersonDetailsModel("ISHA","SHAH","HR"));
        personDetailsModelArrayList.add(new PersonDetailsModel("AKASH","PATEL","PHP"));
        personDetailsModelArrayList.add(new PersonDetailsModel("RAVI","JAIN","JAVA"));
        personDetailsModelArrayList.add(new PersonDetailsModel("SACHIN","MEHTA","ANDROID"));
        personDetailsModelArrayList.add(new PersonDetailsModel("ISHA","SHAH","HR"));
        personDetailsModelArrayList.add(new PersonDetailsModel("AKASH","PATEL","PHP"));
        personDetailsModelArrayList.add(new PersonDetailsModel("RAVI","JAIN","JAVA"));
        personDetailsModelArrayList.add(new PersonDetailsModel("SACHIN","MEHTA","ANDROID"));
        personDetailsModelArrayList.add(new PersonDetailsModel("ISHA","SHAH","HR"));
        personDetailsModelArrayList.add(new PersonDetailsModel("AKASH","PATEL","PHP"));
        personDetailsModelArrayList.add(new PersonDetailsModel("RAVI","JAIN","JAVA"));
        personDetailsModelArrayList.add(new PersonDetailsModel("SACHIN","MEHTA","ANDROID"));
        personDetailsModelArrayList.add(new PersonDetailsModel("ISHA","SHAH","HR"));
        personDetailsModelArrayList.add(new PersonDetailsModel("AKASH","PATEL","PHP"));
        personDetailsModelArrayList.add(new PersonDetailsModel("RAVI","JAIN","JAVA"));
        personDetailsModelArrayList.add(new PersonDetailsModel("SACHIN","MEHTA","ANDROID"));
        personDetailsModelArrayList.add(new PersonDetailsModel("ISHA","SHAH","HR"));
        personDetailsModelArrayList.add(new PersonDetailsModel("AKASH","PATEL","PHP"));
        personDetailsModelArrayList.add(new PersonDetailsModel("RAVI","JAIN","JAVA"));
        personDetailsModelArrayList.add(new PersonDetailsModel("SACHIN","MEHTA","ANDROID"));
        personDetailsModelArrayList.add(new PersonDetailsModel("ISHA","SHAH","HR"));
        personDetailsModelArrayList.add(new PersonDetailsModel("AKASH","PATEL","PHP"));
        personDetailsModelArrayList.add(new PersonDetailsModel("RAVI","JAIN","JAVA"));
        personDetailsModelArrayList.add(new PersonDetailsModel("SACHIN","MEHTA","ANDROID"));
        personDetailsModelArrayList.add(new PersonDetailsModel("ISHA","SHAH","HR"));
        personDetailsModelArrayList.add(new PersonDetailsModel("AKASH","PATEL","PHP"));
        personDetailsModelArrayList.add(new PersonDetailsModel("RAVI","JAIN","JAVA"));
        personDetailsModelArrayList.add(new PersonDetailsModel("SACHIN","MEHTA","ANDROID"));
        personDetailsModelArrayList.add(new PersonDetailsModel("ISHA","SHAH","HR"));
        personDetailsModelArrayList.add(new PersonDetailsModel("AKASH","PATEL","PHP"));
        personDetailsModelArrayList.add(new PersonDetailsModel("RAVI","JAIN","JAVA"));

        RecyclerViewPersonDetailsAdapter personDetailsAdapter = new RecyclerViewPersonDetailsAdapter(personDetailsModelArrayList);
        dashBoardBinding.rvUserDetailsList.setAdapter(personDetailsAdapter);
    }
}