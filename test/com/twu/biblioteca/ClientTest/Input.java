package com.twu.biblioteca.ClientTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private BufferedReader bufferedReader;

    {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public Input() {
    }


    public String input() throws IOException {

        return bufferedReader.readLine();

    }
}
