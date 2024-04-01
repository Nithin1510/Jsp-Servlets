package com.doctorapp.exceptions;

@SuppressWarnings("serial")
public class IdNotFoundException extends Exception{
    public IdNotFoundException() {
    }

    public IdNotFoundException(String message) {
        super(message);
    }
}
