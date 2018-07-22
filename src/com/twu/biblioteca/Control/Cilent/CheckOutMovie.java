package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Control.Common;
import com.twu.biblioteca.Entity.BookEntity;
import com.twu.biblioteca.Entity.MovieEntity;
import com.twu.biblioteca.Exception.BookInvalidException;
import com.twu.biblioteca.Exception.NotFoundException;

public class CheckOutMovie implements Control{
    private Common common = new Common();
    @Override
    public Control next(String input) throws NotFoundException{
        Integer movieId = Integer.parseInt(input);
        MovieEntity movieEntity =common.findMovieById(movieId);
        if (movieEntity == null) {
            System.out.println("The movie is not existed.");
//            throw new NotFoundException("movie");
        }
        else{
            System.out.println("You have checked out the movie.");
        }
        return new Menu();
    }
}

