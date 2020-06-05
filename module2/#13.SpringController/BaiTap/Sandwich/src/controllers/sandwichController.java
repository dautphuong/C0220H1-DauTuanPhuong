package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Optional;

@Controller
public class sandwichController {

    @PostMapping("/choose")
    public String save(@RequestParam Optional<String[]> condiment, Model model) {
        if(condiment.isPresent()){
            model.addAttribute("result", Arrays.toString(condiment.get()));
        }
        return "index";
    }
}
