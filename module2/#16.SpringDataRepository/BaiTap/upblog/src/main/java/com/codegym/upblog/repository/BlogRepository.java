package com.codegym.upblog.repository;

import com.codegym.upblog.model.Blog;
import com.codegym.upblog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;




public interface BlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findByThemeContaining(String keyword, Pageable pageable);
    Page<Blog> findByCategory_Id(Integer category_id, Pageable pageable);
}