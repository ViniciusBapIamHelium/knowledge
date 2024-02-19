package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@RestController()
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getAuthorById(@PathVariable String id) throws Exception {
        return new ResponseEntity<>(authorService.getAuthorById(id), HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity<?> createAuthor(@RequestBody Author author) throws Exception {
        return new ResponseEntity<>(authorService.createAuthor(author), HttpStatus.CREATED);
    }
}
