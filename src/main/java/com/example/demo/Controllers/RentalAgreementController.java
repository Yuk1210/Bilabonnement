package com.example.demo.Controllers;

import com.example.demo.Models.RentalAgreement;
import com.example.demo.Services.RentalAgreementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;

@Controller
public class RentalAgreementController {

    private final RentalAgreementService service;

    public RentalAgreementController(RentalAgreementService service) {
        this.service = service;
    }

    @GetMapping("/aftaler")
    public String getAllAgreements(Model model) {
        model.addAttribute("agreements", service.getAllAgreements());
        return "aftaler";
    }

    @GetMapping("/aftaler/opret")
    public String createForm(Model model) {
        model.addAttribute("agreement", new RentalAgreement(0, null, null, new BigDecimal("3.25"), null, null));
        return "opret-aftale";
    }

    @PostMapping("/aftaler/gem")
    public String saveAgreement(@ModelAttribute RentalAgreement agreement) {
        service.addAgreement(agreement);
        return "redirect:/aftaler";
    }
}