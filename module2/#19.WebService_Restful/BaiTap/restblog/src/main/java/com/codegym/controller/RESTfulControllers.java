package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RESTfulControllers {
    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/getListBlog")
    public ResponseEntity<List<Blog>> getListOfBlog() {
        List<Blog> blogList = blogService.findAll();
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("/getListCategory")
    public ResponseEntity<List<Category>> getListOfCategory() {
        List<Category> categoryList = categoryService.findAll();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/getListBlog/{id}")
    public ResponseEntity<List<Blog>> getListOfBlogByCategory(@PathVariable Integer id) {
        List<Blog> bloglist = blogService.findByCategory_Id(id);
        return new ResponseEntity<>(bloglist, HttpStatus.OK);
    }

    @GetMapping("/getBlog/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
