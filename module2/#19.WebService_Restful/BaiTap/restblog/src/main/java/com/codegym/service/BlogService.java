package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {

    List<Blog> findAll();

    Page<Blog> findAll(Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);

    Page<Blog> findByThemeContaining(String keyword, Pageable pageable);

    Page<Blog> findByCategory_Id(Integer category_id, Pageable pageable);

    List<Blog> findByCategory_Id(Integer category_id);
}

