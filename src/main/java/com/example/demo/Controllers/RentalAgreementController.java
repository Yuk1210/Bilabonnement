package com.example.demo.Controllers;

import org.springframework.ui.Model;
import com.example.demo.Models.RentalAgreement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class RentalAgreementController {

    @GetMapping("/aftaler")
    public String getAllAgreements(Model model) {
        model.addAttribute("agreements", service.getAllAgreements());
        return "aftaler";
    }

    @GetMapping("/aftaler/opret")
    public String createForm(Model model) {
        model.addAttribute("agreement", new RentalAgreement(0,null,null,0,null,null));
        return "opret-aftale";
    }

    @PostMapping("/aftaler/gem")
    public String saveAgreement(@ModelAttribute RentalAgreement agreement) {
        service.addAgreement(agreement);
        return "redirect:/aftaler";
    }
}
