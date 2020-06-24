package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;

@Controller
@SessionAttributes("buy")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String list(Model model,@ModelAttribute("buy") Cart cart) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "view";
    }

    @GetMapping("buy/{id}")
    public String buyProduct(@PathVariable int id,@ModelAttribute("buy") Cart cart,Model model){
        cart.add(productService.findById(id));
        return "index";
    }

    @GetMapping("/list")
    public String list(@ModelAttribute("buy") Cart cart,Model model) {
        model.addAttribute("cart", cart);
        return "list";
    }

    @ModelAttribute("buy")
    public Cart buy() {
        return new Cart();
    }
}
