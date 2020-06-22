package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class FormController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/save")
    public String save(@Valid User user, BindingResult bindingResult,Model model) {

        //custom validate
        new User().validate(user,bindingResult);

        //validate annotation
        if(bindingResult.hasFieldErrors()){
            return "index";
        }

        userService.save(user);
        model.addAttribute("success", "Saved user successfully!");
        return "result";
    }
}
