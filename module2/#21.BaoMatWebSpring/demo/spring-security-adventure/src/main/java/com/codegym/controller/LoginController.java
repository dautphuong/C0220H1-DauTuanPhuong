package com.codegym.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @GetMapping("/")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/home")
    public String goHome() {
        return "home";
    }

    @GetMapping("/403")
    public String go403() {
        return "403";
    }

    @GetMapping("/admin")
    public String goAdmin() {
        return "admin";
    }

    @GetMapping("/member")
    public String goMember() {
        return "member";
    }
}
