package com.example.bsccsit8thsem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductVH> {
    List<Product> productList = new ArrayList<>();
    Context mContext;

    ProductAdapter(List<Product> productList, Context context) {
        this.productList.addAll(productList);
        mContext = context;
    }

    @NonNull
    @Override
    public ProductVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_product_item, parent, false);
        return new ProductVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductVH holder, int position) {
        holder.txtTitle.setText(productList.get(position).getTitle());
        holder.txtDescription.setText(productList.get(position).getDescription());
        holder.txtUnit.setText(productList.get(position).getUnit());
        holder.txtPrice.setText(productList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
