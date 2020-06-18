package com.codegym.upblog.controller;

import com.codegym.upblog.model.Blog;
import com.codegym.upblog.service.BlogService;
import com.codegym.upblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "blog/list";
    }

    @GetMapping("/blog/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("listBlog",categoryService.findAll());
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

