package com.example.list2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFilms;
    public FilmsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFilms = itemView.findViewById(R.id.tv_films);
    }
    public void bind(String films){
        tvFilms.setText(films);
    }
}
