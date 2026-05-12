package com.example.demo.Services;

import com.example.demo.Models.DamageLine;
import com.example.demo.Models.DamageReport;
import com.example.demo.Repositories.JDBCDamageReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageService {

    private final JDBCDamageReportRepository damageReportRepository;

    public DamageService() {
        this.damageReportRepository = new JDBCDamageReportRepository();
    }

    public double calculateTotalDamagePrice(List<DamageLine> damageLines) {
        return damageLines.stream()
                .mapToDouble(DamageLine::getPrice)
                .sum();
    }

    public List<DamageReport> getAllDamageReports() {
        return damageReportRepository.findAll();
    }

    public void addDamageReport(DamageReport damageReport) {
        damageReportRepository.save(damageReport);
    }
}
