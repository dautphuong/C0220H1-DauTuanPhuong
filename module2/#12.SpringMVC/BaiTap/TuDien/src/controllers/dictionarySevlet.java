package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class dictionarySevlet {
    @PostMapping("/search")
    public String searchDictionary(@RequestParam String value, Model model){
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "Xin chào");
        dic.put("how", "Thế nào");
        dic.put("book", "Quyển vở");
        dic.put("computer", "Máy tính");
        String result = dic.get(value);
        if(result!=null) {
            model.addAttribute("result", result);
        }else{
            model.addAttribute("result","Not found");
        }
        return "result";
    }
}
