package com.blog.blog.controller;

import com.blog.blog.model.Post;
import com.blog.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @PostMapping("/addPost")
    public  ResponseEntity<Post> addPost(@RequestBody Post post) {
        return new ResponseEntity<>(postRepository.save(post), HttpStatus.CREATED);
    }
}
