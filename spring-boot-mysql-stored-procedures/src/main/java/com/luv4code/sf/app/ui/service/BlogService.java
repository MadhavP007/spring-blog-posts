package com.luv4code.sf.app.ui.service;

import com.luv4code.sf.app.ui.model.Blog;
import com.luv4code.sf.app.ui.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    @PersistenceContext
    private EntityManager em;


    public List<Blog> getAllBlogs() {
        return em.createNamedStoredProcedureQuery("getAllBlogs").getResultList();
    }
}
