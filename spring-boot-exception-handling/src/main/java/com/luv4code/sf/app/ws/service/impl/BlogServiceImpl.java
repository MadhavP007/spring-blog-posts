package com.luv4code.sf.app.ws.service.impl;

import com.luv4code.sf.app.ws.exception.BlogAlreadyExistsException;
import com.luv4code.sf.app.ws.exception.BlogNotFoundException;
import com.luv4code.sf.app.ws.model.Blog;
import com.luv4code.sf.app.ws.repository.BlogRepository;
import com.luv4code.sf.app.ws.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository repository;

    @Override
    public Blog saveBlog(Blog blog) throws BlogAlreadyExistsException {
        if (repository.existsById(blog.getBlogId())) {
            throw new BlogAlreadyExistsException();
        }
        Blog savedBlog = repository.save(blog);
        return savedBlog;
    }

    @Override
    public List<Blog> getAllBlogs() throws BlogNotFoundException {
        List<Blog> allBlogList = repository.findAll();
        return allBlogList;
    }

    @Override
    public Blog getBlogById(int id) throws BlogNotFoundException {
        Blog blog;
        if (repository.findById(id).isEmpty()) {
            throw new BlogNotFoundException();
        } else
            blog = repository.findById(id).get();
        return blog;
    }
}
