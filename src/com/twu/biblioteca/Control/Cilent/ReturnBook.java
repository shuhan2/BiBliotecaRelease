package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Control.Common;
import com.twu.biblioteca.Control.Control;
import com.twu.biblioteca.Entity.BookEntity;

public class ReturnBook implements Control {
    @Override
    public Control next(String input){
        Integer number = Integer.parseInt(input);
        BookEntity bookEntity = new BookEntity();
        Common common = new Common();
        if (common.findById(number)!=null&&common.findById(number).getIsMoveOut()){
            System.out.println("Thank you for returning the book.");
            return new ReturnBook();
        }
        else{
            System.out.println("That is not a valid book to return.");
        }
        return null;
    }
}
