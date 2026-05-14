package com.example.demo.Controllers;

import com.example.demo.Models.User;
import com.example.demo.Services.UserService;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserService userService =
            new UserService();

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String email, @RequestParam String password,
                        HttpSession session) {

        User user = userService.login(username, email, password);

        if(user != null) {
            session.setAttribute("user", user);
            return "index";
        }
        return "login";
    }
}