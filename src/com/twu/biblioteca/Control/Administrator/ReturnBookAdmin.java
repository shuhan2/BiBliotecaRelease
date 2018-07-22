package com.twu.biblioteca.Control.Administrator;

import com.twu.biblioteca.Control.Common;
import com.twu.biblioteca.Control.Control;
import com.twu.biblioteca.Entity.BookEntity;
import com.twu.biblioteca.Repository.BookRepository;

import java.util.List;


public class ReturnBookAdmin implements Control{
    BookRepository bookRepository = BookRepository.getValues();
    Common common = new Common();

    @Override
    public Control next(String input){

       Integer number = Integer.parseInt(input);
        BookEntity bookEntity = new BookEntity();
        bookEntity =common.findById(number);
        List<BookEntity> oldBookList = bookRepository.getBookList();
        for(int i =0 ; i< oldBookList.size();i++) {
            if (equal(bookEntity,oldBookList.get(i))) {
                List<BookEntity> newBookList = bookRepository.getBookList();
                bookEntity.setIsMoveOut(false);
                newBookList.set(i,bookEntity);
                bookRepository.setBookList(newBookList);
            }
        }
        return null;

    }


    public boolean equal(BookEntity bookEntity1 ,BookEntity bookEntity2) {
        if (bookEntity2 == bookEntity1) {
            return true;
        }
        if (bookEntity1.getId() == bookEntity2.getId() && bookEntity1.getBookTitle() == bookEntity2.getBookTitle() && bookEntity1.getAuthor()
                == bookEntity2.getAuthor() &&2008 == 2008 && bookEntity1.getSummary() ==
                bookEntity2.getSummary() && bookEntity1.getIsMoveOut() == bookEntity2.getIsMoveOut()) {
            return true;
        }
        return false;
    }

}
