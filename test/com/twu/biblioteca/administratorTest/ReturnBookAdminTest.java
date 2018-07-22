package com.twu.biblioteca.administratorTest;

import com.twu.biblioteca.Control.Administrator.ReturnBookAdmin;
import com.twu.biblioteca.Control.Common;
import com.twu.biblioteca.Entity.BookEntity;
import com.twu.biblioteca.Repository.BookRepository;
import org.junit.Before;
import org.junit.Test;

import javax.smartcardio.CommandAPDU;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThat;

public class ReturnBookAdminTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private BookRepository bookRepository = new BookRepository();
    private ReturnBookAdmin returnBookAdmin = new ReturnBookAdmin();
    private BookEntity bookEntity = new BookEntity();
    private Common common = new Common();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_Update_BookStatus(){
        returnBookAdmin.next("2");
        bookEntity = common.findById(2);
        bookEntity.setIsMoveOut(false);
        assertEquals(bookEntity.getIsMoveOut().toString(),bookRepository.getBookList().get(1).getIsMoveOut().toString());
//        assertEquals(bookEntity,);
    }
}
