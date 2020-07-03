package com.codegym.controller.khachhang;

import com.codegym.model.khachhang.KhachHang;
import com.codegym.service.khachhang.KhachHangService;
import com.codegym.service.khachhang.LoaiKhachService;
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
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;

    @Autowired
    LoaiKhachService loaiKhachService;

    @GetMapping("/list/khachhang")
    public String list(Model model, @PageableDefault(size = 10) Pageable pageable,
                       @RequestParam Optional<String> keyword) {
        Page<KhachHang> listKH = null;
        if (!keyword.isPresent()) {
            listKH = khachHangService.findAll(pageable);
        } else {
            //truyền keyword
            listKH = khachHangService.findByHoTenContainingOrIdKhachHangContaining(keyword.get(),keyword.get(), pageable);
            model.addAttribute("keyword", keyword.get());
        }
        model.addAttribute("list", listKH);
        return "khachhang/list";
    }

    @GetMapping("/khachhang/create")
    public String create(Model model) {
        model.addAttribute("khachhang", new KhachHang());
        model.addAttribute("listloaikhach", loaiKhachService.findAll());
        return "khachhang/create";
    }

    @PostMapping("/khachhang/save")
    public String save(@Valid @ModelAttribute("khachhang") KhachHang khachHang, BindingResult bindingResult, RedirectAttributes redirect,Model model) {
        //validate annotation
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("listloaikhach", loaiKhachService.findAll());
            return "khachhang/create";
        }
        khachHangService.save(khachHang);
        redirect.addFlashAttribute("success", "Saved khach hang successfully!");
        return "redirect:/list/khachhang";
    }

    @GetMapping("/khachhang/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("khachhang", khachHangService.findById(id));
        return "khachhang/edit";
    }

    @PostMapping("/khachhang/update/{id}")
    public String update(@Valid @ModelAttribute("khachhang") KhachHang khachHang,BindingResult bindingResult,@PathVariable String id, RedirectAttributes redirect,Model model) {
        //validate annotation
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("khachhang", khachHangService.findById(id));
            return "khachhang/edit";
        }
        khachHangService.save(khachHang);
        redirect.addFlashAttribute("success", "Modified khach hang successfully!");
        return "redirect:/khachhang/view/" + id;
    }

    @GetMapping("/khachhang/delete/{id}")
    public String delete(@PathVariable String id, Model model, RedirectAttributes redirectAttributes) {
        khachHangService.remove(id);
        redirectAttributes.addFlashAttribute("success", "Removed khachhang successfully!");
        return "redirect:/list/khachhang";
    }

    @GetMapping("/khachhang/view/{id}")
    public String view(@PathVariable String id, Model model) {
        model.addAttribute("khachhang", khachHangService.findById(id));
        return "khachhang/view";
    }
}
