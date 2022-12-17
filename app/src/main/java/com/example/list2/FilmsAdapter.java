package com.example.list2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsViewHolder> {
    private ArrayList<String> filmsList;

    public FilmsAdapter(ArrayList<String> filmsList) {
        this.filmsList = filmsList;
    }

    @NonNull
    @Override
    public FilmsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FilmsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_films, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmsViewHolder holder, int position) {
        holder.bind(filmsList.get(position));
    }

    @Override
    public int getItemCount() {
        return filmsList.size();
    }
}
