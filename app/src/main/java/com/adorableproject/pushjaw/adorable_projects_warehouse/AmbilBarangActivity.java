package com.adorableproject.pushjaw.adorable_projects_warehouse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AmbilBarangActivity extends AppCompatActivity {
    private ListView listView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambil_barang_layout);

        listView = (ListView) findViewById(R.id.movies_list);
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie(R.drawable.logo, "After Earth" , "2013"));
        moviesList.add(new Movie(R.drawable.logo, "Baby Driver" , "2017"));
        moviesList.add(new Movie(R.drawable.logo, "Deadpool" , "2016"));
        moviesList.add(new Movie(R.drawable.logo, "Divergent" , "2014"));
        moviesList.add(new Movie(R.drawable.logo, "Fight Club" , "1999"));
        moviesList.add(new Movie(R.drawable.logo, "Jaws" , "1975"));
        moviesList.add(new Movie(R.drawable.logo, "Pirates of the Caribbean" , "2011"));
        moviesList.add(new Movie(R.drawable.logo, "Star Wars" , "2016"));
        moviesList.add(new Movie(R.drawable.logo, "The Grey" , "2011"));

        mAdapter = new MovieAdapter(this,moviesList);
        listView.setAdapter(mAdapter);

    }
}
