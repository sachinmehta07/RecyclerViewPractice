package com.example.recyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpractice.databinding.RowContactListBinding;

import java.util.ArrayList;

public class RecyclerViewContactAdapter extends RecyclerView.Adapter<RecyclerViewContactAdapter.ViewHolder> {

    ArrayList<ContactModel> arrayList;
    RowContactListBinding rowContactListBinding;

    RecyclerViewContactAdapter( ArrayList<ContactModel> arrayList){
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        rowContactListBinding = RowContactListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(rowContactListBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        setData(holder,position);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        RowContactListBinding rowContactListBinding;
        public ViewHolder(@NonNull  RowContactListBinding rowContactListBinding) {
            super(rowContactListBinding.getRoot());
            this.rowContactListBinding = rowContactListBinding;
        }
    }
    public void setData(ViewHolder holder,int position){
        holder.rowContactListBinding.txvName.setText(arrayList.get(position).contactName);
        holder.rowContactListBinding.txvNumber.setText(arrayList.get(position).contactNumber);
        holder.rowContactListBinding.imvContcat.setImageResource(arrayList.get(position).imageContact);
    }
}
