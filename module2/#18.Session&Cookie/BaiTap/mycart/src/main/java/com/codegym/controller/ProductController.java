package com.codegym.controller;

import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("products",productService.findAll());
        return  "index";
    }

    @GetMapping("view/{id}")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "view";
    }
}
