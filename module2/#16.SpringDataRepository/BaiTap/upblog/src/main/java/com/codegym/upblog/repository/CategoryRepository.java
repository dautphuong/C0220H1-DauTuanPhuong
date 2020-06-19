package com.codegym.upblog.repository;


import com.codegym.upblog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Page<Category> findByNameContaining(String keyword, Pageable pageable);
}
