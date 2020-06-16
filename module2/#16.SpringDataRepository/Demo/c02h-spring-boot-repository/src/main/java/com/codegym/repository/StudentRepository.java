package com.codegym.repository;

import com.codegym.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByBirthday(String birthday);
    List<Student> findByBirthdayAndNameOrderById(String birthday, String name);
    List<Student> findByBirthdayLessThan(String birthday);
}
