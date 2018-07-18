package com.example.lenovo.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
ArrayList<Movie> moviesList;
ListView listView;
MovieAdapter movieAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moviesList=new ArrayList<Movie>();
        moviesList.add(new Movie(R.drawable.actor, "After Earth" , "2013"));
        moviesList.add(new Movie(R.drawable.actor, "After Earth" , "2013"));
        moviesList.add(new Movie(R.drawable.actor, "Baby Driver" , "2017"));
        moviesList.add(new Movie(R.drawable.actor, "Deadpool" , "2016"));
        moviesList.add(new Movie(R.drawable.actor, "Divergent" , "2014"));
        moviesList.add(new Movie(R.drawable.actor, "Fight Club" , "1999"));
        moviesList.add(new Movie(R.drawable.actor, "Jaws" , "1975"));
        moviesList.add(new Movie(R.drawable.actor, "Pirates of the Caribbean" , "2011"));
        moviesList.add(new Movie(R.drawable.actor, "Star Wars" , "2016"));
        moviesList.add(new Movie(R.drawable.actor, "The Grey" , "2011"));

        movieAdapter=new MovieAdapter(this,moviesList);
        listView=findViewById(R.id.list_view);
        listView.setAdapter(movieAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String value = movieAdapter.getItem(i).getmName();
        Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
    }
}
