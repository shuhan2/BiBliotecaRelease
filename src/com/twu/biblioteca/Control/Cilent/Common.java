package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Entity.BookEntity;
import com.twu.biblioteca.Repository.BookRepository;

import java.util.List;

public class Common {
    private BookRepository bookRepository = new BookRepository();
    private List<BookEntity> bookList = bookRepository.getBookList();
    public BookEntity findById(int id) {
        for (BookEntity book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
}
