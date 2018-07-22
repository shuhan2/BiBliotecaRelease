package com.twu.biblioteca.Control;

import com.twu.biblioteca.Entity.BookEntity;
import com.twu.biblioteca.Entity.MovieEntity;
import com.twu.biblioteca.Repository.BookRepository;
import com.twu.biblioteca.Repository.MovieRepository;

import java.util.List;

public class Common {
    private BookRepository bookRepository = new BookRepository();
    private List<BookEntity> bookList = bookRepository.getBookList();
    private MovieRepository movieRepository = new MovieRepository();
    private List<MovieEntity> movieList = movieRepository.getMovieList();
    public BookEntity findById(int id) {
        for (BookEntity book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
    public MovieEntity findMovieById(int id) {
        for (MovieEntity movie : movieList) {
            if (movie.getMovieId().equals(id)) {
                return movie;
            }
        }
        return null;
    }
}
