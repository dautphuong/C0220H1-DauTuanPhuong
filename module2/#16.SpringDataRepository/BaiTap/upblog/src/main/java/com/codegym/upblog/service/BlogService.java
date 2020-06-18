package com.codegym.upblog.service;

import com.codegym.upblog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);
}

