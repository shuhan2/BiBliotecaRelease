package com.twu.biblioteca.ClientTest;

import com.twu.biblioteca.Control.Cilent.MovieList;
import com.twu.biblioteca.Repository.BookRepository;
import com.twu.biblioteca.Repository.MovieRepository;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MovieListTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private MovieRepository movieRepository = MovieRepository.getValues();
    private MovieList movieList = new MovieList();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void should_return_allMovies(){
        movieList.next("2");
        assertEquals(movieRepository.getMovieList()+"\r\n",outContent.toString());
    }
}

