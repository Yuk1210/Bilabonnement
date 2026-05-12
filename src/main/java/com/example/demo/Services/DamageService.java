package com.example.demo.Services;

import com.example.demo.Models.DamageLine;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageService {

    public double calculateTotalDamagePrice(List<DamageLine> damageLines) {
        return damageLines.stream()
                .mapToDouble(DamageLine::getPrice)
                .sum();
    }
}
