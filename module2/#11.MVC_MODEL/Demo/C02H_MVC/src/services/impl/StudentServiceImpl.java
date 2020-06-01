package services.impl;

import models.Student;
import services.StudentService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {

    private static Map<Integer, Student> mapStudents;

    static {
        mapStudents = new HashMap<>();
        mapStudents.put(1, new Student(1, "Tien", "2k"));
        mapStudents.put(2, new Student(2, "Long", "2k1"));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(mapStudents.values());
    }

    @Override
    public void save(Student student) {
        mapStudents.put(student.getId(), student);
    }
}
