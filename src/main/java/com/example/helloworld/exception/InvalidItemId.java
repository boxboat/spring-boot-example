package com.example.helloworld.exception;

public class InvalidItemId extends RuntimeException {
    public InvalidItemId(String errorMessage) {
        super(errorMessage);
    }
}
