package com.twu.biblioteca.ClientTest;

import com.twu.biblioteca.Control.Cilent.Printer;
import com.twu.biblioteca.Control.Cilent.ReturnBook;
import com.twu.biblioteca.Control.Cilent.UserInfo;
import com.twu.biblioteca.Entity.UserInfoEntity;
import com.twu.biblioteca.Exception.NotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.*;

import static org.junit.Assert.assertEquals;


public class UserInfoTest {
    private UserInfo userInfo= new UserInfo();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private BufferedReader input;
    private Input in;
    @Mock
    private Printer mockedPrinter;
    @Mock
    private StringReader mockedReader;
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        input = mock(new BufferedReader(new InputStreamReader(System.in)).getClass());
        in = mock(Input.class);
    }
    @Test
    public void shoule_return_userInfo() throws NotFoundException,IOException,Exception{
        userInfo.next("1");
//        when(input.readLine()).thenReturn("1").thenReturn("1");
//        when(in.input()).thenReturn("1").thenReturn("1");
        Mockito.when(mockedReader.read()).thenReturn("1").thenReturn("1");
        UserInfoEntity userInfo = new UserInfoEntity(1,"QianWu","2472520654@qq.com",2512160,"1","1");
        Mockito.verify(mockedPrinter, Mockito.times(1)).print(userInfo.toString());
//        assertEquals(userInfo.toString(),outContent.toString());

    }
    @Test
    public void shoule_return_userInfoError() throws NotFoundException,IOException{
        userInfo.next("1");
//        when(input.readLine()).thenReturn("1").thenReturn("2");

        UserInfoEntity userInfo = new UserInfoEntity(1,"QianWu","2472520654@qq.com",2512160,"1","1");
        assertEquals("Your password is false!/r/n",outContent.toString());

    }
}
