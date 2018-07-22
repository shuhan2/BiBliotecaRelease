package com.twu.biblioteca.Control.Cilent;

import com.twu.biblioteca.Exception.BookInvalidException;
import com.twu.biblioteca.Exception.InputException;
import com.twu.biblioteca.Exception.NotFoundException;

public interface Control {
    Control next(String string) throws InputException,BookInvalidException,NotFoundException;
}
