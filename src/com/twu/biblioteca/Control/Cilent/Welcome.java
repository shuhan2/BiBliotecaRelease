package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Control.Control;

public class Welcome implements Control {
    @Override
    public Control next(String string){
        System.out.println("Welcome to biblioteca");
        return new Menu();
    }
}
