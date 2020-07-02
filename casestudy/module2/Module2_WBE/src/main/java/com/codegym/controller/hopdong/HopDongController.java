package com.codegym.controller.hopdong;

import com.codegym.model.hopdong.HopDong;
import com.codegym.service.hopdong.HopDongChiTietService;
import com.codegym.service.hopdong.HopDongService;
import com.codegym.service.khachhang.KhachHangService;
import com.codegym.service.nhanvien.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HopDongController {
    @Autowired
    HopDongService hopDongService;
    @Autowired
    NhanVienService nhanVienService;
    @Autowired
    KhachHangService khachHangService;
    @Autowired
    HopDongChiTietService hopDongChiTietService;

    @GetMapping("/list/hopdong/{id}")
    public String list(@PathVariable Integer id, Model model, @PageableDefault(size = 2) Pageable pageable) {
//        model.addAttribute("list",hopDongService.findByKhachHang_IdKhachHang(id,pageable));
        model.addAttribute("list", hopDongService.findByKhachHang_IdKhachHang(id));
        model.addAttribute("kh", khachHangService.findById(id));
        return "hopdong/list";
    }

    @GetMapping("/hopdong/create/{id}")
    public String create(@PathVariable Integer id, Model model) {
        model.addAttribute("hopdong", new HopDong());
        model.addAttribute("listNhanVien", nhanVienService.findAll());
        model.addAttribute("kh", khachHangService.findById(id));
        return "hopdong/create";
    }

    @PostMapping("/hopdong/save/{id}")
    public String save(@PathVariable Integer id, @ModelAttribute("hopdong") HopDong hopDong, RedirectAttributes redirect) {
        hopDongService.save(hopDong);
        redirect.addFlashAttribute("success", "Saved hop dong successfully!");
        return "redirect:/list/hopdong/"+ id;
    }

    @GetMapping("/hopdong/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("hopdong", hopDongService.findById(id));
        return "hopdong/edit";
    }

    @PostMapping("/hopdong/update")
    public String update(HopDong hopDong, RedirectAttributes redirect) {
        hopDongService.save(hopDong);
        redirect.addFlashAttribute("success", "Modified hop dong successfully!");
        return "redirect:/list";
    }

    @GetMapping("/hopdong/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("hopdong", hopDongService.findById(id));
        return "hopdong/delete";
    }

    @PostMapping("/hopdong/delete")
    public String delete(@ModelAttribute("hopdong") HopDong hopDong, RedirectAttributes redirectAttributes) {
        hopDongService.remove(hopDong.getIdHopDong());
        redirectAttributes.addFlashAttribute("success", "Removed hop dong successfully!");
        return "redirect:/list/hopdong";
    }

    @GetMapping("/hopdong/view/{idkh}/{id}")
    public String view(@PathVariable Integer id, @PathVariable Integer idkh, Model model) {
        model.addAttribute("hopdong", hopDongService.findById(id));
        model.addAttribute("listHopDongChiTiet", hopDongChiTietService.findByHopDong_IdHopDong(id));
        model.addAttribute("kh", khachHangService.findById(idkh));
        return "hopdong/view_listHopDongChiTiet";
    }
}
