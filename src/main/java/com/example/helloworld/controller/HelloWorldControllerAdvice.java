package com.example.helloworld.controller;

import com.example.helloworld.exception.InvalidItemId;
import com.example.helloworld.exception.NotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HelloWorldControllerAdvice {
    
    /**
     * Returns 404 not found when item id is not found in the database
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public void notFound() {
        // todo
    }

    /**
     * Returns 400 bad request when provided an invalid item id for lookup
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidItemId.class)
    public void invalidRequest() {
        // todo
    }
    
}
