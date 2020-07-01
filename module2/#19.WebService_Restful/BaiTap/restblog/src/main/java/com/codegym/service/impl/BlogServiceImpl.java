package com.codegym.service.impl;


import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findByThemeContaining(String keyword, Pageable pageable) {
        return blogRepository.findByThemeContaining(keyword, pageable);
    }

    @Override
    public Page<Blog> findByCategory_Id(Integer category_id, Pageable pageable) {
        return blogRepository.findByCategory_Id(category_id, pageable);
    }

    @Override
    public List<Blog> findByCategory_Id(Integer category_id) {
        return blogRepository.findByCategory_Id(category_id);
    }
}
