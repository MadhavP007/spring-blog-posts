package com.luv4code.sf.app.ui.controller;

import com.luv4code.sf.app.ui.model.Blog;
import com.luv4code.sf.app.ui.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<Blog> getTotalBlogs() {
        return blogService.getAllBlogs();
    }

}
