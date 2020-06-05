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
    @PostMapping("/caculation")
    public String caculation(@RequestParam double num1,@RequestParam double num2,@RequestParam String submit,Model model){
        model.addAttribute("result",cal.Caculation(num1,num2,submit));
        return "index";
    }
}
