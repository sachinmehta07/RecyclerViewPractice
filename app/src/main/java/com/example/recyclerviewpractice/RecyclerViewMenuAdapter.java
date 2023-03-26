package com.example.recyclerviewpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpractice.databinding.RowMenuItemListBinding;

import java.util.ArrayList;

public class RecyclerViewMenuAdapter extends RecyclerView.Adapter<RecyclerViewMenuAdapter.ViewHolder> {

    ArrayList<MenuItemModel> itemModelArrayList;

    RecyclerViewMenuAdapter(ArrayList<MenuItemModel> itemModelArrayList){
        this.itemModelArrayList = itemModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(RowMenuItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.menuItemListBinding.txvOptionTitle.setText(itemModelArrayList.get(position).optionTitle);
        holder.menuItemListBinding.txvOptionDesc.setText(itemModelArrayList.get(position).optionDesc);
        holder.menuItemListBinding.txvOptionImg.setImageResource(itemModelArrayList.get(position).OptionImg);
    }

    @Override
    public int getItemCount() {
        return itemModelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
      RowMenuItemListBinding menuItemListBinding;

        public ViewHolder(RowMenuItemListBinding menuItemListBinding) {
            super(menuItemListBinding.getRoot());
            this.menuItemListBinding = menuItemListBinding;
        }
    }
}
