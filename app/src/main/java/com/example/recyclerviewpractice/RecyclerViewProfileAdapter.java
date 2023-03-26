package com.example.recyclerviewpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpractice.databinding.RowPersonListBinding;

import java.util.ArrayList;

public class RecyclerViewProfileAdapter extends RecyclerView.Adapter<RecyclerViewProfileAdapter.ViewHolder> {

    ArrayList<PersonDetailsModel> arrayList;

    RecyclerViewProfileAdapter( ArrayList<PersonDetailsModel> arrayList){
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(RowPersonListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.rowPersonListBinding.txvFirstName.setText(arrayList.get(position).userLName);
        holder.rowPersonListBinding.txvLasttName.setText(arrayList.get(position).userLName);
        holder.rowPersonListBinding.txvDepName.setText(arrayList.get(position).userDepName);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RowPersonListBinding rowPersonListBinding;

        public ViewHolder(RowPersonListBinding rowPersonListBinding) {
            super(rowPersonListBinding.getRoot());
            this.rowPersonListBinding = rowPersonListBinding;
        }
    }
}
