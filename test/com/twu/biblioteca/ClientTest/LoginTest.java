package com.twu.biblioteca.ClientTest;

import com.twu.biblioteca.Control.Cilent.CheckOutMovie;
import com.twu.biblioteca.Control.Cilent.UserInfo;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoginTest {
    private UserInfo userInfo = new UserInfo();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


}
