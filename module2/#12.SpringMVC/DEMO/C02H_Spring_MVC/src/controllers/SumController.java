package controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import services.SumService;
import services.impl.SumServiceImpl;

@Controller
public class SumController {

    @Autowired
    SumService sumService;
//    SumService sumService=new SumServiceImpl();

//    @RequestMapping(value = "/sum2Num", method = RequestMethod.GET)
//    @RequestMapping(value = "/sum2Num", method = RequestMethod.POST)
//    @GetMapping("/sum2Num")
//    @PostMapping("/sum2Num")

//    public String sum2Num(@RequestParam String number1,
//                          @RequestParam("number2") String number222,
//                          Model model) {
//        double a = Double.parseDouble(number1);
//        double b = Double.parseDouble(number222);
//        //sum 2 so
////        double result = sumService.sum(a, b);
//
//        model.addAttribute("total2Num", sumService.sum(a, b));
//
//        return "result";
//    }

//    @PostMapping("/sum2Num")
//    public ModelAndView sum2Num(@RequestParam String number1,
//                       @RequestParam("number2") String number222) {
//
//        double a = Double.parseDouble(number1);
//        double b = Double.parseDouble(number222);
//        //sum 2 so
////        double result = sumService.sum(a, b);
//        ModelAndView modelAndView = new ModelAndView("result");
//        modelAndView.addObject("total2Num", sumService.sum(a, b));
////        model.addAttribute("total2Num", sumService.sum(a, b));
//
//        return modelAndView;
//    }

    @PostMapping("/sum2Num")
    public ModelAndView sum2Num(@RequestParam String number1,
                       @RequestParam("number2") String number222) {

        double a = Double.parseDouble(number1);
        double b = Double.parseDouble(number222);
        //sum 2 so
//        double result = sumService.sum(a, b);
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("total2Num", sumService.sum(a, b));
        ModelAndView modelAndView = new ModelAndView("result", modelMap);

        return modelAndView;
    }
}
