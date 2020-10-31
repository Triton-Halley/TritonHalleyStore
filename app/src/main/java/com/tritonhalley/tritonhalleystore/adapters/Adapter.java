package com.tritonhalley.tritonhalleystore.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.tritonhalley.tritonhalleystore.R;
import com.tritonhalley.tritonhalleystore.data.model.Product;
import com.tritonhalley.tritonhalleystore.databinding.ListItemsBinding;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ProductHolder> {
    private List<Product> products;
    private Context mContext;

    public Adapter(List<Product> products, Context context) {
        this.products = products;
        mContext = context;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemsBinding listItems = DataBindingUtil.inflate(
                LayoutInflater.from(mContext),
                R.layout.list_items,
                parent,
                false);
        return new ProductHolder(listItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {
        holder.bindItem(products.get(position));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class ProductHolder extends RecyclerView.ViewHolder {
        private ListItemsBinding mListItemsBinding;
        private Product mProduct;
        public ProductHolder(ListItemsBinding listItems) {
            super(listItems.getRoot());
            mListItemsBinding = listItems;
        }
        public void bindItem(Product product){
            mProduct = product;

        }
    }
}
