package com.codegym.controller.hopdong;

import com.codegym.model.hopdong.HopDongChiTiet;
import com.codegym.service.dichvu.DichVuDiKemService;
import com.codegym.service.hopdong.HopDongChiTietService;
import com.codegym.service.hopdong.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HopDongChiTietController {
    @Autowired
    HopDongChiTietService hopDongChiTietService;
    @Autowired
    HopDongService hopDongService;
    @Autowired
    DichVuDiKemService dichVuDiKemService;

    @GetMapping("/hopdongchitiet/create/{idkh}/{id}")
    public String create(@PathVariable Integer id,@PathVariable Integer idkh,Model model){
        model.addAttribute("hopdongchitiet",new HopDongChiTiet());
        model.addAttribute("hd",hopDongService.findById(id));
        model.addAttribute("idkh",idkh);
        model.addAttribute("dichvudikem",dichVuDiKemService.findAll());
        return "hopdong/createHopDongChiTiet";
    }

    @PostMapping("/hopdongchitiet/save/{idkh}/{id}")
    public String save(@PathVariable Integer idkh,@PathVariable Integer id,@ModelAttribute("hopdongchitiet") HopDongChiTiet hopDongChiTiet, RedirectAttributes redirect) {
        hopDongChiTietService.save(hopDongChiTiet);
        redirect.addFlashAttribute("success", "Saved hop dong chi tiet successfully!");
        return ("redirect:/hopdong/view/"+idkh+"/"+id);
    }
}
