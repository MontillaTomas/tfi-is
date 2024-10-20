package com.example.tfi_is.exception;

public class EmailAlreadyInUseException extends Exception{
    public EmailAlreadyInUseException(String message) {
        super(message);
    }
}
