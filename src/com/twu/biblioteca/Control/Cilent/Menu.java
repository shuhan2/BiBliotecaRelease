package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Exception.InputException;

public class Menu implements Control {
    @Override
    public Control next(String input) throws InputException{
        Integer number = Integer.parseInt(input);
        switch(number){
            case 1:return new BookList();
            default:throw new InputException();
        }
    }
}
