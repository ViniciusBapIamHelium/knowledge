package com.example.demo.service;

import com.example.demo.model.Post;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(SpringExtension.class)
class JsonPlaceHolderServiceTest {

    @Mock
    List<String> mockedList;

    @Mock
    JsonPlaceHolderService jsonPlaceHolderService;

    @Spy
    List<String> spiedList = new ArrayList<String>();
    @Test
    public void whenNotUseMockAnnotation_thenCorrect_new(){
        List<Post> posts = List.of(
                    Post.builder().id(1).body("Body").title("title").userId(101).build(),
                    Post.builder().id(2).body("Text inside the body").title("title of the title").userId(102).build()
                    );

        Mockito.when(jsonPlaceHolderService.getPosts()).thenReturn(posts);

        List<Post> postList = jsonPlaceHolderService.getPosts();

        assertEquals(2, postList.size());
    }

}