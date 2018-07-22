package com.twu.biblioteca.ClientTest;

import com.twu.biblioteca.Control.Cilent.CheckOutBook;
import com.twu.biblioteca.Control.Cilent.CheckOutMovie;
import com.twu.biblioteca.Exception.BookInvalidException;
import com.twu.biblioteca.Exception.NotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class CheckOutMovieTest {
    private CheckOutMovie checkOutMovie = new CheckOutMovie();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_print_SuccessCheckOut() throws BookInvalidException,NotFoundException {
        checkOutMovie.next("1");;
        assertEquals("You have checked out the movie.\r\n",outContent.toString());

    }
    @Test
    public void should_print_NotExisted() throws BookInvalidException,NotFoundException{
        checkOutMovie.next("3");
        assertEquals("The movie is not existed.\r\n",outContent.toString());

    }

}
