package com.codegym.models;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String birthday;

    @ManyToOne
    @JoinColumn(name = "class_student_id")
    private ClassStudent classStudent;

    public Student() {
    }

    public Student(Integer id, String name, String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public ClassStudent getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(ClassStudent classStudent) {
        this.classStudent = classStudent;
    }
}
