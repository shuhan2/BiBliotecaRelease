package com.twu.biblioteca.ClientTest;


import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class StringReader {
    private Scanner scanner;

    public StringReader() {
        this.scanner = new Scanner(System.in);
    }

    public String read() throws Exception {
        String input = this.scanner.next();
        if (StringUtils.isAlpha(input)) {
            return input;
        } else {
            throw new Exception("Invalid Input");
        }
    }
}
