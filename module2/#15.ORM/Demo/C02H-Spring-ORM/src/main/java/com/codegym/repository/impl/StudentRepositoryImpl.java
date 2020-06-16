package com.codegym.repository.impl;

import com.codegym.models.Student;
import com.codegym.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository(value = "studentRepo1")
@Transactional
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> typedQuery = entityManager.createQuery(
                "select s from Student s", Student.class);

        return typedQuery.getResultList();
    }

    @Override
    public Student findById(Integer id) {
        TypedQuery<Student> typedQuery = entityManager.createQuery(
                "select s from Student s where s.id = :id", Student.class);
        typedQuery.setParameter("id", id);

        return typedQuery.getSingleResult();
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

}
