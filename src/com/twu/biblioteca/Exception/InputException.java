package com.twu.biblioteca.Exception;

public class InputException extends Exception{
    public InputException() {
        super("Input invalid,please input again");
    }
    public InputException(String message) {
        super(message);
    }
}
