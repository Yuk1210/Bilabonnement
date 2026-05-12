
package com.example.demo.Repositories;

import com.example.demo.Models.DamageReport;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JDBCDamageReportRepository {
    private final List<DamageReport> damageReports = new ArrayList<>();

    public List<DamageReport> findAll() {
        return new ArrayList<>(damageReports);
    }

    public Optional<DamageReport> findById(int id) {
        return damageReports.stream()
                .filter(report -> report.getId() == id)
                .findFirst();
    }

    public DamageReport save(DamageReport damageReport) {
        findById(damageReport.getId()).ifPresent(damageReports::remove);
        damageReports.add(damageReport);
        return damageReport;
    }
}