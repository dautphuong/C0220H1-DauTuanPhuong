package com.codegym.repository.impl;

import com.codegym.models.Student;
import com.codegym.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository(value = "studentRepo1")
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Integer, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, "Tien", "2k"));
        studentMap.put(2, new Student(2, "Khanh", "2k1"));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public Student findById(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }

}
