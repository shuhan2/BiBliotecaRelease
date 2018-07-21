package com.twu.biblioteca.ClientTest;

import com.twu.biblioteca.Control.ReturnBook;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class ReturnBookTest {
    private ReturnBook returnBook= new ReturnBook();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void should_return_ReturnBookSucceed(){
        returnBook.next("2");
        assertEquals("Thank you for returning the book.\r\n",outContent.toString());
    }
    @Test
    public void should_return_ReturnBookFailNotExisted(){
        returnBook.next("4");
        assertEquals("That is not a valid book to return.\r\n",outContent.toString());
    }
    @Test
    public void should_return_ReturnBookFailIsNotMovedout(){
        returnBook.next("1");
        assertEquals("That is not a valid book to return.\r\n",outContent.toString());
    }

}
