package com.twu.biblioteca.ClientTest;

import com.twu.biblioteca.Control.Cilent.CheckOut;
import com.twu.biblioteca.Exception.BookInvalidException;
import com.twu.biblioteca.Exception.NotFoundException;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class CheckOutTest {
    private CheckOut checkOut = new CheckOut();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_print_SuccessCheckOut() throws BookInvalidException,NotFoundException {
        checkOut.next("1");;
        assertEquals("Thank you! Enjoy the book\r\n",outContent.toString());

    }
    @Test
    public void should_print_NotExisted() throws BookInvalidException,NotFoundException{
        checkOut.next("3");
        assertEquals("That book is not existed.\r\n",outContent.toString());

    }
    public void should_print_FailCheckOut() throws BookInvalidException,NotFoundException{
        checkOut.next("2");
        assertEquals("That book is not available.",outContent.toString());

    }
}
