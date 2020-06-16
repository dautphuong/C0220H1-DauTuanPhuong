package com.codegym.repository;

import com.codegym.model.Blog;


import java.util.List;

public interface BlogRepository {
    List<Blog> findAll();

    Blog findById(Integer id);

    void save(Blog model);

    void remove(Integer id);
}