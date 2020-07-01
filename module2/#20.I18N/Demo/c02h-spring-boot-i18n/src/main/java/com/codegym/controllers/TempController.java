package com.codegym.controllers;

import com.codegym.models.Temp;
import com.codegym.services.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {

    @Autowired
    private TempService tempService;

    @GetMapping("/saveTemp")
    public String saveTemp() {
        String dateForm = "18-06-2020";
        String[] dateArray = dateForm.split("-");

        Temp temp = new Temp();
        temp.setId((int) (Math.random() * 10000));
//        temp.setDateOfBirth("2020-06-26");
        temp.setDateOfBirth(dateArray[2] + "-" + dateArray[1] + "-" + dateArray[0]);

        tempService.save(temp);

        tempService.findAll();

        return "tempSuccess";
    }
}
