package com.blog.blog.controller;

import com.blog.blog.model.Post;
import com.blog.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @PostMapping("/addPost")
    public  ResponseEntity<Post> addPost(@RequestBody Post post) {
        return new ResponseEntity<>(postRepository.save(post), HttpStatus.CREATED);
    }

    @GetMapping("/allPost")
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @DeleteMapping("/deletePost/{id}")
    public Integer deletePost(@PathVariable("id") int id) {
        postRepository.deleteById(id);
        return id;
    }
}