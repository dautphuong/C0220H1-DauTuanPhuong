package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Zack", 18));
        listStudent.add(new Student("Thien", 20));
        listStudent.add(new Student("Anh", 25));
        listStudent.add(new Student("Binh", 17));
//        SortStudentAgeComparator sortStudentAgeComparator = new SortStudentAgeComparator();
        Collections.sort(listStudent);
//        Collections.sort(listStudent, new SortStudentAgeComparator());
//        Collections.sort(listStudent, new SortStudentNameComparator());
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(listStudent);

    }
}
