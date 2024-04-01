package com.doctorapp.exceptions;

@SuppressWarnings("serial")
public class DoctorNotFoundException extends Exception{
    public DoctorNotFoundException() {
    }

    public DoctorNotFoundException(String message) {
        super(message);
    }
}
