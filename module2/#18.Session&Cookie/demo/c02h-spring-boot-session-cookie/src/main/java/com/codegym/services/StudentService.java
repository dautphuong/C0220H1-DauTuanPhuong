package com.codegym.services;

import com.codegym.models.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    Page<Student> findAll(Pageable pageable);
    Student findById(Integer id);
    void save(Student student);
    Page<Student> findByNameContaining(String keyword, Pageable pageable);
}
