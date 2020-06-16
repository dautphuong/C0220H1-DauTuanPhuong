package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "index";
    }

    @GetMapping("/blog/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/blog/save")
    public String save(Blog blog, RedirectAttributes redirect) {
        blogService.save(blog);
        redirect.addFlashAttribute("success", "Saved blog successfully!");
        return "redirect:/";
    }

    @GetMapping("/blog/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "edit";
    }

    @PostMapping("/blog/update")
    public String update(Blog blog, RedirectAttributes redirect) {
        blogService.save(blog);
        redirect.addFlashAttribute("success", "Modified blog successfully!");
        return "redirect:/";
    }

    @GetMapping("/blog/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }
    @PostMapping("/blog/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        blogService.remove(blog.getId());
        redirect.addFlashAttribute("success", "Removed blog successfully!");
        return "redirect:/";
    }
    @GetMapping("/blog/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }
}

