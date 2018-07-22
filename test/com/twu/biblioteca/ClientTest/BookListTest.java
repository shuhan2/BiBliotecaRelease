package com.twu.biblioteca.ClientTest;

import com.twu.biblioteca.Control.Cilent.BookList;
import com.twu.biblioteca.Control.Cilent.Menu;
import com.twu.biblioteca.Exception.InputException;
import com.twu.biblioteca.Repository.BookRepository;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class BookListTest {
    private BookList bookList = new BookList();
    private Menu menu = new Menu();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private BookRepository bookRepository = BookRepository.getValues();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void should_return_AllList(){
        bookList.next("1");
        assertEquals(bookRepository.getBookList()+"\r\n",outContent.toString());
    }
    @Test(expected = InputException.class)
    public void should_return_Error() throws InputException {
        menu.next("12");

    }
}
