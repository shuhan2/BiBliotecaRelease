package com.twu.biblioteca.Repository;

import com.twu.biblioteca.Entity.BookEntity;
import com.twu.biblioteca.Exception.BookInvalidException;
import com.twu.biblioteca.Exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    public List<BookEntity> getBookList() {
        return bookList;
    }

    public List<BookEntity> bookList =  new ArrayList<BookEntity>();

    public void defineData() {

        bookList.add(new BookEntity(1, "Refactoring", "Martin Fowler", "summary", 2010, false));
        bookList.add(new BookEntity(2, "Head First Java", "Kathy Sierra", "summary", 2008, true));

    }

    public BookRepository(){
        defineData();
    }





}
