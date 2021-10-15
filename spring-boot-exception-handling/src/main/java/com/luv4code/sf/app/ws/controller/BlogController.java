package com.luv4code.sf.app.ws.controller;

import com.luv4code.sf.app.ws.exception.BlogAlreadyExistsException;
import com.luv4code.sf.app.ws.exception.BlogNotFoundException;
import com.luv4code.sf.app.ws.model.Blog;
import com.luv4code.sf.app.ws.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/blogs")
public class BlogController {
    @Autowired
    private BlogService service;

    @PostMapping
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog) throws BlogAlreadyExistsException {
        Blog savedBlog = service.saveBlog(blog);
        return new ResponseEntity<>(savedBlog, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogs() throws BlogNotFoundException {
        List<Blog> blogsList = service.getAllBlogs();
        return new ResponseEntity<>(blogsList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable("id") int id) throws BlogNotFoundException {
        Blog blogById = service.getBlogById(id);
        return new ResponseEntity<>(blogById, HttpStatus.OK);
    }
}
