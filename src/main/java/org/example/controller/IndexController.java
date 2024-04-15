package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class IndexController {
    @GetMapping
    public String time(){
        return LocalDateTime.now().toString();
    }
}
