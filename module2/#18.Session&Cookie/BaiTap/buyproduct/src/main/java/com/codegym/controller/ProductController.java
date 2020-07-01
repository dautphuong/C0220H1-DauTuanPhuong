package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("buy")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "view";
    }

    @GetMapping("buy/{id}")
    public String buyProduct(@PathVariable int id, @SessionAttribute("buy") Cart cart, RedirectAttributes redirect) {
        cart.add(productService.findById(id));
        redirect.addFlashAttribute("success", "Buy successfully!");
        return "redirect:/";
    }

    @GetMapping("/list")
    public String list(@SessionAttribute("buy") Cart cart, Model model) {
        model.addAttribute("cart", cart);
        return "list";
    }

    @ModelAttribute("buy")
    public Cart buy() {
        return new Cart();
    }
}
