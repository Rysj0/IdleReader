package com.example.administrator.idlereader.Movie;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;

import com.example.administrator.idlereader.R;


public class FgMovieFragment extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_movie, container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}
