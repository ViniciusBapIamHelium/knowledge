package com.example.demo.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Author {

    @Id
    private String id;
    private String name;
}
