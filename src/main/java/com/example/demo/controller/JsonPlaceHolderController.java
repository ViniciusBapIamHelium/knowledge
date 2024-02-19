package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.repository.JSONPlaceHolderClient;
import com.example.demo.service.JsonPlaceHolderService;
import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jsonplaceholder")
public class JsonPlaceHolderController {

    @Autowired
    private JsonPlaceHolderService jsonPlaceHolderService;
    @GetMapping("/posts")
    ResponseEntity<List<?>> getPosts() {
        return new ResponseEntity<>(jsonPlaceHolderService.getPosts(), HttpStatus.OK);
    }

    @PostMapping("/posts")
    public ResponseEntity<?> createPost(@RequestBody Post post){
        return new ResponseEntity<>(jsonPlaceHolderService.createPost(post), HttpStatus.CREATED);
    }
}
