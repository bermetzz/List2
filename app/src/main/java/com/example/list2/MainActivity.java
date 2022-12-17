package com.example.list2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView filmsRecyclerView;
    private ArrayList<String> filmsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filmsRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        FilmsAdapter adapter = new FilmsAdapter(filmsList);
        filmsRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        filmsList.add("Interstellar");
        filmsList.add("Devil wears Prada");
        filmsList.add("Love, Rosie");
        filmsList.add("Twenties century girl");
        filmsList.add("Leon");
        filmsList.add("Inception");
        filmsList.add("When the promised flower blooms");
        filmsList.add("The shape of voice");
        filmsList.add("Лёд");
        filmsList.add("Twilight");
        filmsList.add("Soul");
    }
}