package com.codegym.upblog.controller;


import com.codegym.upblog.model.Category;
import com.codegym.upblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("categorys", categoryService.findAll());
        return "category/index";
    }

    @GetMapping("/category/create")
    public String create(Model model){
        model.addAttribute("category",new Category());
        return "category/create";
    }

}
