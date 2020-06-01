package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VNDSelvlet {
    @PostMapping("/VND")
    public String chuyenTien(@RequestParam String number1, Model model){
        double a=Double.parseDouble(number1);
        double b=a*23000;
        model.addAttribute("number2",b);
        return "index";
    }
}
