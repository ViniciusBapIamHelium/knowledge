package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.JSONPlaceHolderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class JsonPlaceHolderService {

    @Autowired
    private JSONPlaceHolderClient jsonPlaceHolderClient;

    public Post createPost(Post post) {
        Post postCreated = jsonPlaceHolderClient.createPost(post);
        Optional<Integer> optionalNumber = Optional.ofNullable(postCreated.getId());
        if(!optionalNumber.isPresent()) {
            throw new RuntimeException("Error");
        }
        return postCreated;
    }

    public List<Post> getPosts(){
        return jsonPlaceHolderClient.getPosts();
    }
}
