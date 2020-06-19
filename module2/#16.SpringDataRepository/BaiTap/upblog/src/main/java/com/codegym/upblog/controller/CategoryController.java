package com.codegym.upblog.controller;


import com.codegym.upblog.model.Blog;
import com.codegym.upblog.model.Category;
import com.codegym.upblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public String list(Model model, @PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> keyword) {
        Page<Category> categories = null;
        if (!keyword.isPresent()) {
            categories = categoryService.findAll(pageable);
        } else {
            categories = categoryService.findByNameContaining(keyword.get(), pageable);
            model.addAttribute("keyword",keyword.get());
        }
        model.addAttribute("categorys", categories);
        //Create category
        model.addAttribute("category", new Category());
        return "category/index";
    }

    @PostMapping("/category/save")
    public String save(@ModelAttribute("category") Category category, RedirectAttributes redirect) {
        categoryService.save(category);
        redirect.addFlashAttribute("success", "Saved category successfully!");
        return "redirect:/";
    }

    @GetMapping("/category/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("category", categoryService.findById(id));
        return "category/delete";
    }

    @PostMapping("/category/delete")
    public String delete(Category category, RedirectAttributes redirect) {
        categoryService.remove(category.getId());
        redirect.addFlashAttribute("success", "Removed category successfully!");
        return "redirect:/";
    }

    @GetMapping("/category/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("category", categoryService.findById(id));
        return "category/edit";
    }

    @PostMapping("/category/update")
    public String update(Category category, RedirectAttributes redirect) {
        categoryService.save(category);
        redirect.addFlashAttribute("success", "Modified category successfully!");
        return "redirect:/list";
    }
}
