package com.codegym.upblog.service;


import com.codegym.upblog.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();

   Category findById(Integer id);

    void save(Category category);

    void remove(Integer id);
}
