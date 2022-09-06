package com.webapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/")
    public String index() {
        return greetingService.getGreeting();
    }

    @GetMapping("/hello")
    public String hello() {
        return greetingService.asyncGreeting();
    }

    @GetMapping("/zero")
    public String zero() {
        return greetingService.zeroGreeting();
    }
}