package com.company.Exceptions;

public class InvalidIbanException extends Exception{
    public InvalidIbanException(String message) {
        super(message);
    }
}
