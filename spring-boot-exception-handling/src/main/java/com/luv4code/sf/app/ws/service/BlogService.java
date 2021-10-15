package com.luv4code.sf.app.ws.service;

import com.luv4code.sf.app.ws.exception.BlogAlreadyExistsException;
import com.luv4code.sf.app.ws.exception.BlogNotFoundException;
import com.luv4code.sf.app.ws.model.Blog;

import java.util.List;

public interface BlogService {
    Blog saveBlog(Blog blog) throws BlogAlreadyExistsException;

    List<Blog> getAllBlogs() throws BlogNotFoundException;

    Blog getBlogById(int id) throws BlogNotFoundException;
}