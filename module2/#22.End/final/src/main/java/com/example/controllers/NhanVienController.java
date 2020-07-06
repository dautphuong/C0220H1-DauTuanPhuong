package com.example.controllers;

import com.example.model.NhanVien;
import com.example.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class NhanVienController {
    @Autowired
    NhanVienService nhanVienService;

    //thuc hien danh sach nhan vien
    @GetMapping("/")
    public String list(Model model, @RequestParam Optional<String> keyword) {
        List<NhanVien> list = null;
        if (!keyword.isPresent()) {
            list = nhanVienService.findAll();
        } else {
            list = nhanVienService.findBySoCMNDContainingOrNgaySinhContaining(keyword.get(),keyword.get());
        }

        model.addAttribute("list", list);
        return "index";
    }

    //thuc hien them moi nhan vien
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("nhanvien", new NhanVien());
        return "create";
    }

    //thuc hien luu du lieu vao datab
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("nhanvien") NhanVien nhanVien, BindingResult bindingResult) {
        //custom validate
        if(!nhanVien.ngaySinh.equals("")) {
            new NhanVien().validate(nhanVien, bindingResult);
        }
        //validate annotation
        if (bindingResult.hasFieldErrors()) {
            return "/create";
        }

        nhanVienService.save(nhanVien);
        return "redirect:/";
    }

    //thuc hien xoa nhan vien
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        nhanVienService.remove(id);
        return "redirect:/";
    }
}
