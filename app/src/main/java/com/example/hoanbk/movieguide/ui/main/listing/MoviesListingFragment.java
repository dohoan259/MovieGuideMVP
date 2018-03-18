package com.example.hoanbk.movieguide.ui.main.listing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hoanbk.movieguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesListingFragment extends Fragment {


    public MoviesListingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies_listing, container, false);
    }

}
