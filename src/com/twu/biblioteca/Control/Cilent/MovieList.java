package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Control.Control;
import com.twu.biblioteca.Repository.MovieRepository;

public class MovieList implements Control {
    private MovieRepository movieRepository = MovieRepository.getValues();
    @Override
    public Control next(String input) {
        System.out.println(movieRepository.getMovieList());
        return null;
    }
}
