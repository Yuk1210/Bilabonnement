package com.example.demo.Controllers;

import com.example.demo.Models.User;
import com.example.demo.Services.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserService userService = new UserService();

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        User user = userService.login(username, password);

        if (user != null) {
            if (user.getRole().name().equals("DATAREGISTRERING")) {
                return "rentalagreement";
            }
            if (user.getRole().name().equals("SKADE")) {
                return "damagereport";
            }
            if (user.getRole().name().equals("FORRETNINGSUDVIKLER")) {
                return "dashboard";
            }
        }

        return "login";
    }
}