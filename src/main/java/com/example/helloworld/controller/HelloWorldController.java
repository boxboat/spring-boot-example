package com.example.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/helloworld")
	public ResponseEntity<String> greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return new ResponseEntity<String>("Hello World", HttpStatus.CREATED);
	}

}
