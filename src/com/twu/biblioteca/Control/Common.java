package com.twu.biblioteca.Control;

import com.twu.biblioteca.Entity.BookEntity;
import com.twu.biblioteca.Entity.MovieEntity;
import com.twu.biblioteca.Entity.UserInfoEntity;
import com.twu.biblioteca.Repository.BookRepository;
import com.twu.biblioteca.Repository.MovieRepository;
import com.twu.biblioteca.Repository.UserInfoRepository;

import java.util.List;

public class Common {
    private BookRepository bookRepository = BookRepository.getValues();
    private List<BookEntity> bookList = bookRepository.getBookList();
    private MovieRepository movieRepository = MovieRepository.getValues();
    private List<MovieEntity> movieList = movieRepository.getMovieList();
    private UserInfoRepository userInfoRepository = UserInfoRepository.getValues();
    private List<UserInfoEntity> userList = userInfoRepository.getUserInfoExtityList();
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
    public UserInfoEntity findUserByaccount(String account) {
        for (UserInfoEntity user : userList) {
            if (user.getAccount().equals(account)) {
                return user;
            }
        }
        return null;
    }
}
