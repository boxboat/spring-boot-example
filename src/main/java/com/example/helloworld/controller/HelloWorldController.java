package com.example.helloworld.controller;

import com.example.helloworld.object.DatabaseLookupItem;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    /**
     * Basic hello world greeting
     */
    @GetMapping("/helloworld")
	public ResponseEntity<String> greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        String greeting = "Hello " + name;
        return new ResponseEntity<String>(greeting, HttpStatus.CREATED);
	}

    /**
     * Look up information for the given item id
     */
    @GetMapping("/lookup/{id}")
	public ResponseEntity<DatabaseLookupItem> getItem(@PathVariable(name="id") String id) {
        DatabaseLookupItem item = new DatabaseLookupItem(id);
        //todo
        //for now, just return the generated item
        return new ResponseEntity<DatabaseLookupItem>(item, HttpStatus.CREATED);
	}

}
