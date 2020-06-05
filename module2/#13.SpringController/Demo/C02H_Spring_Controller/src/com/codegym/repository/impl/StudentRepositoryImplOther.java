package com.codegym.repository.impl;

import com.codegym.models.Student;
import com.codegym.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "studentRepo2")
public class StudentRepositoryImplOther implements StudentRepository {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }
}
