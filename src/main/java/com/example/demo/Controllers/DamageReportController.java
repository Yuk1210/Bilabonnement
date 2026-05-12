package com.example.demo.Controllers;

import com.example.demo.Models.DamageReport;
import com.example.demo.Services.DamageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DamageReportController {

    private final DamageService service;

    public DamageReportController(DamageService service) {
        this.service = service;
    }

    @GetMapping("/skader")
    public String getAllDamageReports(Model model) {
        model.addAttribute("damageReports", service.getAllDamageReports());
        return "skader";
    }

    @GetMapping("/skader/opret")
    public String createForm(Model model) {
        model.addAttribute("damageReport", new DamageReport(0, null, null));
        return "opret-skade";
    }

    @PostMapping("/skader/gem")
    public String saveDamageReport(@ModelAttribute DamageReport damageReport) {
        service.addDamageReport(damageReport);
        return "redirect:/skader";
    }
}