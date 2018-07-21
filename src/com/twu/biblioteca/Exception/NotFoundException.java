package com.twu.biblioteca.Exception;

public class NotFoundException extends Exception{

    public NotFoundException(String message) {
        super(message+" is not found");
    }
}
