package com.codegym.upblog.service;

import com.codegym.upblog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);

    Page<Blog> findByThemeContaining(String keyword, Pageable pageable);

    Page<Blog> findByCategory_Id(Integer category_id, Pageable pageable);
}

