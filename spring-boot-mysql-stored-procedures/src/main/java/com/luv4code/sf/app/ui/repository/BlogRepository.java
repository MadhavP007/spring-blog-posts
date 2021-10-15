package com.luv4code.sf.app.ui.repository;

import com.luv4code.sf.app.ui.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Long> {
}
