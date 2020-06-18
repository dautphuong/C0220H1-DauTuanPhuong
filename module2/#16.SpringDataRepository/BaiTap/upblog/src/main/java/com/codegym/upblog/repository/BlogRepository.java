package com.codegym.upblog.repository;

import com.codegym.upblog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BlogRepository extends JpaRepository<Blog,Integer> {
}