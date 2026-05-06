package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class CarController {

    @GetMapping("/biler")
    public String showCars() {
        return "biler";
    }

    @GetMapping("/biler/udlejede")
    public String showRentedCars() {
        return "udlejede-biler";
    }

    @GetMapping("/biler/ledige")
    public String showAvailableCars() {
        return "ledige-biler";
    }

    @GetMapping("/biler/returnerede")
    public String showReturnedCars() {
        return "returnerede-biler";
    }
}
