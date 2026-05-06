package com.example.demo.Models;
import java.time.LocalDate;

public class DamageReport {
    private int id;
    private LocalDate reportDate;
    private String description;


    public DamageReport(int id, LocalDate reportDate, String description) {
        this.id = id;
        this.reportDate = reportDate;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
