package com.example.helloworld.validation;

import com.example.helloworld.exception.InvalidItemId;

import org.springframework.stereotype.Service;

@Service
public class InputValidator {
    public void validateItemId(String itemId) {
        if (itemId.length() > 10) {
            throw new InvalidItemId("Item Id longer than 10 characters");
        }
    }
}
