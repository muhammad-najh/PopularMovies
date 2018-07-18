package com.example.lenovo.popularmovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter  extends ArrayAdapter<Movie>{

    public  MovieAdapter(Context context,ArrayList<Movie> arrayList){
        super(context,0,arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //2 list_iteam
        //3 listView
    View listIteam=convertView;
    if(listIteam==null)
        listIteam= LayoutInflater.from(getContext()).inflate(R.layout.list_item_movie,parent,false);
        Movie currentMovie=getItem(position);

        TextView actorTextView=listIteam.findViewById(R.id.name_actor);
        actorTextView.setText(currentMovie.getmName());
        TextView releaseTextView=listIteam.findViewById(R.id.release);
        releaseTextView.setText(currentMovie.getmRelease());

        ImageView imageView=listIteam.findViewById(R.id.image);
        imageView.setImageResource(currentMovie.getmImageDrawable());
    return listIteam;

    }
}
