package com.twu.biblioteca.Control;

import com.twu.biblioteca.Repository.BookRepository;

public class BookList implements Control{
    private BookRepository bookRepository = new BookRepository();
    @Override
    public Control next(String string){
        System.out.println(bookRepository.getBookList());
        return null;
    }
}
