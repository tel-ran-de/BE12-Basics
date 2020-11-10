package com.company.Exceptions;

public class InvalidIbanLengthException extends Exception{
    public InvalidIbanLengthException(String message) {
        super(message);
    }
}
