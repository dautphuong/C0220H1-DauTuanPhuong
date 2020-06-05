package com.codegym.controllers;

import com.codegym.models.Student;
import com.codegym.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public String showList() {

//        List<Student> studentList = studentService.findAll();

        return "list";
    }

    @GetMapping("/detail")
    public String showDetail(@RequestParam Integer id, Model model) {

        Student student = studentService.findById(id);
        model.addAttribute("studentAbc", student);
        return "detail";
    }

    @GetMapping("/detail/{idStudent}")
    public String showDetailPathVariable(@PathVariable("idStudent") Integer id, Model model) {

        Student student = studentService.findById(id);
        model.addAttribute("studentAbc", student);

        return "detail";
    }
}
