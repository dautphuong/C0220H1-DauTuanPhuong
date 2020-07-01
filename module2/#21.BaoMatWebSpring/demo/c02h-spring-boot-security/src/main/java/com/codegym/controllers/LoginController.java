package com.codegym.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

@Controller
@SessionAttributes("userInfo")
public class LoginController {

//    @ModelAttribute("userInfo")
//    public User initUser() {
//        return new User();
//    }

    @GetMapping("/login")
    public String login(Model model,
                        @CookieValue(value = "cookieUser", defaultValue = "") String usernameCookie,
                        @CookieValue(value = "cookiePassword", defaultValue = "") String passwordCookie) {
        model.addAttribute("userC", usernameCookie);
        model.addAttribute("passwordC", passwordCookie);
        return "login";
    }

    @GetMapping("/checkLogin")
    public String checkLogin(Principal principal,
                             HttpServletResponse response,
                             HttpServletRequest request,
                             Model model) {
        // set session
//        request.getSession().setAttribute("userInfo", user);
        // get session
//        User userServlet = (User) request.getSession().getAttribute("userInfo");

        User user = (User) ((Authentication) principal).getPrincipal();
        model.addAttribute("userInfo", user);

        // check login
        Cookie cookieUser = new Cookie("cookieUser", user.getUsername());
//        cookieUser.setMaxAge(10);
        Cookie cookiePassword = new Cookie("cookiePassword", user.getPassword());
//        cookiePassword.setMaxAge(10);

        response.addCookie(cookieUser);
        response.addCookie(cookiePassword);

        return "redirect:/list";
    }

    @GetMapping("403")
    public String go403() {
        return "403";
    }
}
