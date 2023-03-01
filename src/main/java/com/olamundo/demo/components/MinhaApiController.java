package com.olamundo.demo.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinhaApiController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/goodbye")
    public String goodbyeWorld() {
        return "Goodbye World";
    }
}
