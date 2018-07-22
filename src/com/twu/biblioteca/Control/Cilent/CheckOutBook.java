package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Control.Control;
import com.twu.biblioteca.Entity.BookEntity;
import com.twu.biblioteca.Exception.BookInvalidException;
import com.twu.biblioteca.Exception.NotFoundException;
import com.twu.biblioteca.Repository.BookRepository;

import java.util.List;

public class CheckOutBook implements Control {
    private BookRepository bookRepository = new BookRepository();
    private List<BookEntity> bookList = bookRepository.getBookList();
    private Log log = new Log();
    public BookEntity findById(int id) {
        for (BookEntity book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
    public void checkOutBook(int id) throws BookInvalidException, NotFoundException{
        BookEntity bookEntity = findById(id);
        if (bookEntity == null) {
            System.out.println("The book is not existed");
            throw new NotFoundException("Book");
        }
        else{
            if (bookEntity.getIsMoveOut()){
                throw new BookInvalidException("Book"+bookEntity.getBookTitle()+"has been checked out");
            }
            else {
                bookEntity.setIsMoveOut(true);
            }
        }
    }
    @Override
    public Control next(String input) throws NotFoundException{
        Integer number = Integer.parseInt(input);
        if(log.login(log.getAccount(),log.getPassword())) {
            BookEntity bookentity = new BookEntity();
            if (findById(number) != null) {
                try {
                    checkOutBook(number);
                    System.out.println("Thank you! Enjoy the book");
                } catch (BookInvalidException exception) {
                    System.out.println("That book is not available.");
                }

            }
            else {
                System.out.println("That book is not existed.");
            }
        }
        else{
            System.out.println("Please login");

        }
        return new Menu();
    }
}
