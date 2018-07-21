package com.twu.biblioteca.ClientTest;

import com.twu.biblioteca.Control.Welcome;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class WelcomeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Welcome welcome = new Welcome();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void welcomeTest_should_return_welcome(){
        welcome.next();
        assertEquals("Welcome to biblioteca\r\n",outContent.toString());
    }

}
