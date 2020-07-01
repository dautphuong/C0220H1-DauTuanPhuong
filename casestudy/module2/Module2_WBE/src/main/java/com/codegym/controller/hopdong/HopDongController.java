package com.codegym.controller.hopdong;

import com.codegym.model.hopdong.HopDong;
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
public class HopDongController {
    @Autowired
    HopDongService hopDongService;

    @GetMapping("/list/hopdong")
    public String list(Model model){
        Model list = model.addAttribute("list", hopDongService.findAll());
        return "hopdong/list";
    }

    @GetMapping("/hopdong/create")
    public String create(Model model){
        model.addAttribute("hopdong",new HopDong());
        return "hopdong/create";
    }

    @PostMapping("/hopdong/save")
    public String save(@ModelAttribute("hopdong") HopDong hopDong, RedirectAttributes redirect) {
        hopDongService.save(hopDong);
        redirect.addFlashAttribute("success", "Saved hop dong successfully!");
        return "redirect:/list/hopdong";
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
    public String delete(@PathVariable int id,Model model){
        model.addAttribute("hopdong",hopDongService.findById(id));
        return "hopdong/delete";
    }
    @PostMapping("/hopdong/delete")
    public String delete(@ModelAttribute("hopdong") HopDong hopDong,RedirectAttributes redirectAttributes){
        hopDongService.remove(hopDong.getIdHopDong());
        redirectAttributes.addFlashAttribute("success", "Removed hop dong successfully!");
        return "redirect:/list/hopdong";
    }
}
