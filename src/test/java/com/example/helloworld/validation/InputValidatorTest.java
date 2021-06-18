package com.example.helloworld.validation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class InputValidatorTest {
    
    @Autowired
    private InputValidator validator;

    @Test
	public void testValidateItemIdSuccess() {
        validator.validateItemId("12345");
	}
}
