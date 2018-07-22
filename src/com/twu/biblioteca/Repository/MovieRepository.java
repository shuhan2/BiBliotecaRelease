package com.twu.biblioteca.Repository;

import com.twu.biblioteca.Entity.MovieEntity;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    public List<MovieEntity> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<MovieEntity> movieList) {
        this.movieList = movieList;
    }

    public List<MovieEntity> movieList = new ArrayList<MovieEntity>();
    private static MovieRepository movieRepository;

    public MovieRepository(){
        movieList.add(new MovieEntity(1,"Operation Red Sea",2018,"Dante Lam",9));
        movieList.add(new MovieEntity(1,"operation MEKONG",2016,"Dante Lam",9));
    }
    public synchronized static MovieRepository getValues() {
        if (movieRepository == null) {
            movieRepository = new MovieRepository();
        }
        return movieRepository;
    }
}
