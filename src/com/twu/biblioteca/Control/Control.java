package com.twu.biblioteca.Control;

import com.twu.biblioteca.Exception.InputException;

public interface Control {
    Control next(String string) throws InputException;
}
