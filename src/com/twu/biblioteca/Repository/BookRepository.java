package com.twu.biblioteca.Repository;

import com.twu.biblioteca.Entity.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    List<BookEntity> bookList =  new ArrayList<BookEntity>();

    private BookRepository(){
        bookList.add(new BookEntity(1, "Refactoring", "Martin Fowler", "summary", 2010, false));
        bookList.add(new BookEntity(2, " Learn SQL the Hard Way", "Zed A. Shaw", "sql", 2008, false));
        bookList.add(new BookEntity(3, "Test-driven Development", "Kent Beck","Test-driven development ", 2003, false));
    }



}
