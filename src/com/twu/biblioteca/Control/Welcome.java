package com.twu.biblioteca.Control;

public class Welcome implements Control{
    @Override
    public Control next(){
        System.out.println("Welcome to biblioteca");
        return new ClientMenu();
    }
}
