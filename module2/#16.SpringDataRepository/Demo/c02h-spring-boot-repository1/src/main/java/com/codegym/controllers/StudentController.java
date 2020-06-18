package com.codegym.controllers;

import com.codegym.models.Student;
import com.codegym.services.ClassStudentService;
import com.codegym.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ClassStudentService classStudentService;

    @GetMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String showList(Model model) {

        List<Student> studentList = studentService.findAll();
        model.addAttribute("students", studentList);

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

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("listClass", classStudentService.findAll());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute(value = "student") Student student,
                         RedirectAttributes redirectAttributes) {
//        student.setId((int) (Math.random() * 1000));

        studentService.save(student);

        redirectAttributes.addFlashAttribute("message", "Register successfully!");
        redirectAttributes.addFlashAttribute("c02h", "C02H");

        return "redirect:/list";
    }

}
