package com.example.helloworld.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class HelloWorldControllerTest {
    
    @Autowired
    private HelloWorldController controller;
    
    @Test
    public void contextLoads() {
        assertNotNull(controller);
    }

    @Test
	public void testGreeting() {
        ResponseEntity<String> testResult = controller.greeting("name");
        
        assertEquals("Hello name", testResult.getBody());
        assertEquals(HttpStatus.CREATED, testResult.getStatusCode());
	}
    
}
