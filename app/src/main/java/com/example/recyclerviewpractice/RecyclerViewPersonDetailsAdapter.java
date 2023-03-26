package com.example.recyclerviewpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpractice.databinding.RowPersonListBinding;

import java.util.ArrayList;

public class RecyclerViewPersonDetailsAdapter extends RecyclerView.Adapter<RecyclerViewPersonDetailsAdapter.ViewHolder> {

    RowPersonListBinding personListBinding;

    ArrayList<PersonDetailsModel> personDetailsModelArrayList;

    RecyclerViewPersonDetailsAdapter(ArrayList<PersonDetailsModel> personDetailsModelArrayList){
        this.personDetailsModelArrayList = personDetailsModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        personListBinding = RowPersonListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new ViewHolder(personListBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.personListBinding.txvFirstName.setText(personDetailsModelArrayList.get(position).userFName);
        holder.personListBinding.txvLasttName.setText(personDetailsModelArrayList.get(position).userLName);
        holder.personListBinding.txvDepName.setText(personDetailsModelArrayList.get(position).userDepName);
    }

    @Override
    public int getItemCount() {
        return personDetailsModelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        RowPersonListBinding personListBinding;

        public ViewHolder(RowPersonListBinding personListBinding) {
            super(personListBinding.getRoot());
            this.personListBinding = personListBinding;
        }
    }
}
