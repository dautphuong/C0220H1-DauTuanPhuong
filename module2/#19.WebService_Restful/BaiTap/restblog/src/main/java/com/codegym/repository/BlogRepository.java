package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findByThemeContaining(String keyword, Pageable pageable);
    Page<Blog> findByCategory_Id(Integer category_id, Pageable pageable);
    List<Blog> findByCategory_Id(Integer category_id);
}