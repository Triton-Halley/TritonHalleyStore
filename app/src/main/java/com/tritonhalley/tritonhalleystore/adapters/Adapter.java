package com.tritonhalley.tritonhalleystore.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ProductHolder> {

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ProductHolder extends RecyclerView.ViewHolder {

        public ProductHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
