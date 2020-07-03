package com.codegym.controller.dichvu;

import com.codegym.model.dichvu.DichVu;

import com.codegym.model.dichvu.KieuThue;
import com.codegym.service.dichvu.DichVuService;
import com.codegym.service.dichvu.KieuThueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class DichVuController {
    @Autowired
    DichVuService dichVuService;
    @Autowired
    KieuThueService kieuThueService;

    @GetMapping("/list/dichvu")
    public String list(Model model, @PageableDefault(size = 10) Pageable pageable,
                       @RequestParam Optional<String> keyword){
        Page<DichVu> listDV = null;
        if (!keyword.isPresent()) {
            listDV = dichVuService.findAll(pageable);
        } else {
            //truyền keyword
            listDV = dichVuService.findByIdDichVuContainingOrTenDichVuContaining(keyword.get(),keyword.get(), pageable);
            model.addAttribute("keyword", keyword.get());
        }
        model.addAttribute("list",listDV);
        return "dichvu/list";
    }

    @GetMapping("/dichvu/create")
    public String create(Model model){
        model.addAttribute("dichvu",new DichVu());
        model.addAttribute("listkieuthue",kieuThueService.findAll());
        return "dichvu/create";
    }


    @PostMapping("/dichvu/save")
    public String save(@Valid @ModelAttribute("dichvu") DichVu dichVu, BindingResult bindingResult, RedirectAttributes redirect,Model model) {
        //validate annotation
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("listdichvu", dichVuService.findAll());
            return "dichvu/create";
        }
        dichVuService.save(dichVu);
        redirect.addFlashAttribute("success", "Saved dich vu successfully!");
        return "redirect:/list/dichvu";
    }

    @GetMapping("/dichvu/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("dichvu", dichVuService.findById(id));
        return "dichvu/edit";
    }

    @PostMapping("/dichvu/update/{id}")
    public String update(@PathVariable String id,@ModelAttribute("dichvu") DichVu dichVu, RedirectAttributes redirect) {
        dichVuService.save(dichVu);
        redirect.addFlashAttribute("success", "Modified dich vu successfully!");
        return "redirect:/dichvu/view/" + id;
    }


    @GetMapping("/dichvu/delete/{id}")
    public String delete(@PathVariable String id, Model model, RedirectAttributes redirectAttributes) {
        dichVuService.remove(id);
        redirectAttributes.addFlashAttribute("success", "Removed dich vu successfully!");
        return "redirect:/list/dichvu";
    }


    @GetMapping("/dichvu/view/{id}")
    public String view(@PathVariable String id, Model model) {
        model.addAttribute("dichvu", dichVuService.findById(id));
        return "dichvu/view";
    }
}
