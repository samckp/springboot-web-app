package edu.webapp.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/{name}")
    public String hello( @PathVariable(value = "name", required = false) String name) {

            return "Hello " +name ;
    }
}
