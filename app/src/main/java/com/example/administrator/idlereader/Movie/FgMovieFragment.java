package com.example.administrator.idlereader.Movie;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.idlereader.Bean.MoviesBean;
import com.example.administrator.idlereader.Movie.Presenter.MoviesPresenter;
import com.example.administrator.idlereader.Movie.View.IMoviesView;
import com.example.administrator.idlereader.R;


public class FgMovieFragment extends Fragment implements IMoviesView {

    private TextView tv_movie;
    private MoviesPresenter moviesPresenter;
    private SwipeRefreshLayout srl_movies;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_movie, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        moviesPresenter = new MoviesPresenter(this);
        tv_movie = view.findViewById(R.id.tv_movie);
        srl_movies = view.findViewById(R.id.srl_movies);
        srl_movies.setColorSchemeColors(Color.parseColor("#ffce3d3a"));
        srl_movies.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                moviesPresenter.loadNews("in_theaters");
            }
        });
    }

    @Override
    public void showNews(MoviesBean moviesBean) {
        tv_movie.setText(moviesBean.getSubjects().get(0).getTitle()+
                moviesBean.getSubjects().get(0).getDirectors());
    }

    @Override
    public void hideDialog() {
        srl_movies.setRefreshing(false);
    }

    @Override
    public void showDialog() {
        srl_movies.setRefreshing(true);
    }

    @Override
    public void showErrorMsg(Throwable throwable) {

    }
}
