package com.example.android.popularmoviestageone;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsbaidwan on 04/02/17.
 */
public class ImageAdapter extends ArrayAdapter<Movie> {

    List<Movie> list;

    private static final String LOG_TAG = ImageAdapter.class.getSimpleName();

    /* Constructor to instantiate ImageAdpater   */
    public ImageAdapter(Activity context, List<Movie> movieList)    {
        super(context, 0, movieList);
        list = new ArrayList<>();
        list = movieList;  //Storing the movies into a list so that it can be used later on.

    }

    /* Return number of cells*/
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        Movie movie = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_movie, parent, false);
       }
        ImageView moviePoster = (ImageView) convertView.findViewById(R.id.list_item_movieImage);
        moviePoster.setImageResource(list.get(0).image);
        return convertView;
    }
}
