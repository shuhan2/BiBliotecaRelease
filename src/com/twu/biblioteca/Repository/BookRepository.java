package com.twu.biblioteca.Repository;

import com.twu.biblioteca.Entity.BookEntity;
import com.twu.biblioteca.Exception.BookInvalidException;
import com.twu.biblioteca.Exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static BookRepository bookRepository;
    public List<BookEntity> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookEntity> bookList) {
        this.bookList = bookList;
    }

    public List<BookEntity> bookList =  new ArrayList<BookEntity>();

    public BookRepository() {

        bookList.add(new BookEntity(1, "Refactoring", "Martin Fowler", "summary", 2010, false));
        bookList.add(new BookEntity(2, "Head First Java", "Kathy Sierra", "summary", 2008, true));

    }


    public synchronized static BookRepository getValues() {
        if (bookRepository == null) {
            bookRepository = new BookRepository();
        }
        return bookRepository;
    }





}
