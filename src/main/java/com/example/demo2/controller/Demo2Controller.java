package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Demo2Controller {
    @GetMapping("/")
    public String getMessage() {
        return "Hello You";
    }
}
