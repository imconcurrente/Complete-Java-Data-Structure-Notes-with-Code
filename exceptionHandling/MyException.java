package com.java.exceptionHandling;

public class MyException extends Exception{
// By this we are able to call our own exceptions
    public MyException(String message) {
        super(message);
    }
}
