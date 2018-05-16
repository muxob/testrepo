package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String greeting() {
        return "Hello";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
