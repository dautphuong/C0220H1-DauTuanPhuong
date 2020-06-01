package com.codegym;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // < 0, = 0, > 0
    @Override
    public int compareTo(Student student2) {
//        return this.name.compareTo(student2.name);
        if (this.age < student2.age) {
            return 1;
        } else if (this.age == student2.age) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
