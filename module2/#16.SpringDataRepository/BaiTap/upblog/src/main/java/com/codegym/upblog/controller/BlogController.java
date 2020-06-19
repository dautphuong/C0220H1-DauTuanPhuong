package com.codegym.upblog.controller;

import com.codegym.upblog.model.Blog;
import com.codegym.upblog.service.BlogService;
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
public class BlogController {

    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    //view all
    @GetMapping("/list")
    public String list(Model model, @PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> keyword) {
        Page<Blog> blogs = null;
        if (!keyword.isPresent()) {
            blogs = blogService.findAll(pageable);
        } else {
            blogs = blogService.findByThemeContaining(keyword.get(), pageable);
            model.addAttribute("keyword", keyword.get());
        }
        model.addAttribute("blogs", blogs);
        return "blog/list";
    }

    //view theo id category
    @GetMapping("/list/{id}")
    public String listBlog(Model model, @PageableDefault(size = 3) Pageable pageable, @PathVariable Integer id, @RequestParam Optional<String> keyword) {
        Page<Blog> blogs = null;
        blogs = blogService.findByCategory_Id(id, pageable);
        model.addAttribute("blogs", blogs);
        if (!keyword.isPresent()) {
            blogs = blogService.findAll(pageable);
        } else {
            blogs = blogService.findByThemeContaining(keyword.get(), pageable);
            model.addAttribute("keyword", keyword.get());
        }
        model.addAttribute("idblog", id);
        return "blog/list";
    }

    @GetMapping("/blog/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("listCategory", categoryService.findAll());
        return "blog/create";
    }

    @PostMapping("/blog/save")
    public String save(@ModelAttribute("blog") Blog blog, RedirectAttributes redirect) {
        blogService.save(blog);
        redirect.addFlashAttribute("success", "Saved blog successfully!");
        return "redirect:/list";
    }

    @GetMapping("/blog/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/edit";
    }

    @PostMapping("/blog/update")
    public String update(Blog blog, RedirectAttributes redirect) {
        blogService.save(blog);
        redirect.addFlashAttribute("success", "Modified blog successfully!");
        return "redirect:/list";
    }

    @GetMapping("/blog/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/delete";
    }

    @PostMapping("/blog/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        blogService.remove(blog.getId());
        redirect.addFlashAttribute("success", "Removed blog successfully!");
        return "redirect:/list";
    }

    @GetMapping("/blog/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/view";
    }
}

