package com.codegym.controller.khachhang;

import com.codegym.model.khachhang.KhachHang;
import com.codegym.service.khachhang.KhachHangService;
import com.codegym.service.khachhang.LoaiKhachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;

    @Autowired
    LoaiKhachService loaiKhachService;

    @GetMapping("/list/khachhang")
    public String list(Model model){
        model.addAttribute("list",khachHangService.findAll());
        model.addAttribute("listloaikhach",loaiKhachService.findAll());
        return "khachhang/list";
    }

    @GetMapping("/khachhang/create")
    public String create(Model model){
        model.addAttribute("khachhang",new KhachHang());
        model.addAttribute("listloaikhach",loaiKhachService.findAll());
        return "khachhang/create";
    }

    @PostMapping("/khachhang/save")
    public String save(@ModelAttribute("khachhang") KhachHang khachHang, RedirectAttributes redirect) {
        khachHangService.save(khachHang);
        redirect.addFlashAttribute("success", "Saved khach hang successfully!");
        return "redirect:/list/khachhang";
    }

    @GetMapping("/khachhang/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("khachhang", khachHangService.findById(id));
        return "khachhang/edit";
    }

    @PostMapping("/khachhang/update")
    public String update(KhachHang khachHang, RedirectAttributes redirect) {
        khachHangService.save(khachHang);
        redirect.addFlashAttribute("success", "Modified khach hang successfully!");
        return "redirect:/list";
    }

    @GetMapping("/khachhang/delete/{id}")
    public String delete(@PathVariable int id,Model model){
        model.addAttribute("khachhang",khachHangService.findById(id));
        return "khachhang/delete";
    }
    @PostMapping("/khachhang/delete")
    public String delete(@ModelAttribute("khachhang") KhachHang khachHang,RedirectAttributes redirectAttributes){
        khachHangService.remove(khachHang.getIdKhachHang());
        redirectAttributes.addFlashAttribute("success", "Removed khachhang successfully!");
        return "redirect:/list/khachhang";
    }
}
