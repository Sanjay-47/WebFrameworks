package com.project1.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Message {
    @GetMapping("/w")
    public String hello()
    {
        return "Hi good morning";
    }
}