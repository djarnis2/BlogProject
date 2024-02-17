package org.example.blog.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public class blogController {

    private ArrayList<String> blogs = new ArrayList<>();

    @GetMapping("/blogs")
    public ResponseEntity<ArrayList<String>> getBlogs() {
        return ResponseEntity.ok(blogs);
    }

    @PostMapping("/blogs/create")
    public ResponseEntity<String> addBlog(@RequestBody String blog) {
        blogs.add(blog);
        return ResponseEntity.ok(blog);
    }
}
