package com.codegym.upblog.service;


import com.codegym.upblog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();

    Page<Category> findAll(Pageable pageable);

    Category findById(Integer id);

    void save(Category category);

    void remove(Integer id);

    Page<Category> findByNameContaining(String keyword, Pageable pageable);
}
