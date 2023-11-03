package com.example.demo.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController()
public class AuthorController {

    @GetMapping("/authors")
    public List<String> getAllAuthors(){
        return Arrays.asList("Vinicius", "Vittor");
    }
}
