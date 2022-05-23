package com.example.bsccsit8thsem;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductVH extends RecyclerView.ViewHolder {
    public TextView txtTitle, txtDescription, txtUnit, txtPrice;

    public ProductVH(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtProductTitle);
        txtDescription = itemView.findViewById(R.id.txtDescription);
        txtUnit = itemView.findViewById(R.id.txtUnit);
        txtPrice = itemView.findViewById(R.id.txtPrice);
    }
}