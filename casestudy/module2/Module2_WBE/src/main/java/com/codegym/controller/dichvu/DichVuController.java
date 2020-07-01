package com.codegym.controller.dichvu;

import com.codegym.model.dichvu.DichVu;

import com.codegym.service.dichvu.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DichVuController {
    @Autowired
    DichVuService dichVuService;

    @GetMapping("/list/dichvu")
    public String list(Model model){
        model.addAttribute("list",dichVuService.findAll());
        return "dichvu/list";
    }

    @GetMapping("/dichvu/create")
    public String create(Model model){
        model.addAttribute("dichvu",new DichVu());
        return "dichvu/create";
    }

    @PostMapping("/dichvu/save")
    public String save(@ModelAttribute("dichvu") DichVu dichVu, RedirectAttributes redirect) {
        dichVuService.save(dichVu);
        redirect.addFlashAttribute("success", "Saved dich vu successfully!");
        return "redirect:/list/dichvu";
    }

    @GetMapping("/dichvu/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("dichvu", dichVuService.findById(id));
        return "dichvu/edit";
    }

    @PostMapping("/dichvu/update")
    public String update(DichVu dichVu, RedirectAttributes redirect) {
        dichVuService.save(dichVu);
        redirect.addFlashAttribute("success", "Modified dich vu successfully!");
        return "redirect:/list";
    }

    @GetMapping("/dichvu/delete/{id}")
    public String delete(@PathVariable int id,Model model){
        model.addAttribute("dichvu",dichVuService.findById(id));
        return "dichvu/delete";
    }
    @PostMapping("/dichvu/delete")
    public String delete(@ModelAttribute("dichvu") DichVu dichVu,RedirectAttributes redirectAttributes){
        dichVuService.remove(dichVu.getIdDichVu());
        redirectAttributes.addFlashAttribute("success", "Removed dich vu successfully!");
        return "redirect:/list/dichvu";
    }
}
