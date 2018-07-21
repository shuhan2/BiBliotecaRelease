package com.twu.biblioteca.Repository;

import com.twu.biblioteca.Entity.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    public List<BookEntity> getBookList() {
        return bookList;
    }

    List<BookEntity> bookList =  new ArrayList<BookEntity>();


    //        bookList.add(new BookEntity(2, "Test-driven Development", "Kent Beck","Test-driven development ", 2003, false));
//    private BookRepository(){
//        bookL
// ist.add(new BookEntity(1, "Head First Java", "Kathy Sierra", "Java", 2008, false));
//        bookList.add(new BookEntity(2, "Test-driven Development", "Kent Beck","Test-driven development ", 2003, false));
//    }
    public BookRepository(){

    }




}
