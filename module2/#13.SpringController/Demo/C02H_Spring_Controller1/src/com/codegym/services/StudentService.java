package com.codegym.services;

import com.codegym.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Integer id);
}
