package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Post {

    private Integer id;
    private Integer userId;
    private String title;
    private String body;
}
