package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.CaculationService;

@Controller
public class CaculationController {

    @Autowired
    CaculationService cal;

    @PostMapping("/calculate")
    public String calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String choose, Model model) {
        model.addAttribute("result", cal.calculate(num1, num2, choose));
        return "index";
    }
}
