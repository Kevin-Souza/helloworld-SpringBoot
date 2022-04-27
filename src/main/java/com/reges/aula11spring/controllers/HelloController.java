package com.reges.aula11spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá mundo!";
    }
    
    
}
