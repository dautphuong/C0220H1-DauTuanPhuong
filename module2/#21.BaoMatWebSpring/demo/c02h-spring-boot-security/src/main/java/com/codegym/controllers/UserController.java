package com.codegym.controllers;

import com.codegym.models.User;
import com.codegym.services.RoleService;
import com.codegym.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @GetMapping("register")
    public String goRegister(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("roleList", roleService.findAll());
        return "register";
    }

    @PostMapping("register")
    public String register(@ModelAttribute User user) {
        userService.save(user);

        return "redirect:/login";
    }
}
