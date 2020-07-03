package com.codegym.repository;

import com.codegym.models.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student findById(Integer id);
}