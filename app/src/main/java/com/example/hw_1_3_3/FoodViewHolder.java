package com.example.hw_1_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class FoodViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFood;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFood = itemView.findViewById(R.id.tv_food);
    }

    public void bind(String food) {
        tvFood.setText(food);
    }
}

