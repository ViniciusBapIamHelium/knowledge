package com.example.demo.service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author getAuthorById(String id) throws Exception {
        Optional<Author> author = authorRepository.findById(id);
        if(!author.isPresent()){
            throw new Exception("Author not found");
        }
        return author.get();
    }

    public Author createAuthor(Author author) throws Exception {
        Author authorSaved = authorRepository.save(author);
        if(authorSaved.getId().isEmpty()){
            throw new Exception("Fail to create Author");
        }
        return authorRepository.save(author);
    }

}
