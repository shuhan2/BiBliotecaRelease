package com.twu.biblioteca.Exception;

public class InputException extends Exception{
    public InputException() {
        super("Input invalid,please select a valid choice");
    }
    public InputException(String message) {
        super(message);
    }
}
