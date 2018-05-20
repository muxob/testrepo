package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String greeting() {
        return "Hello";
    }

    @GetMapping("/")
    public String index() {
        return "indexat";
    }
}
