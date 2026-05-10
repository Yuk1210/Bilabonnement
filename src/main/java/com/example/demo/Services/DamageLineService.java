package com.example.demo.Services;

import com.example.demo.Models.DamageLine;
import com.example.demo.Repositories.DamageLineRepository;
import com.example.demo.Repositories.JDBCDamageLineRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DamageLineService {

    private DamageLineRepository damageLineRepository;

    public DamageLineService() {
        this.damageLineRepository = new JDBCDamageLineRepository();
    }

    public List<DamageLine> getAllDamageLines() {
        return damageLineRepository.findAll();
    }

    public DamageLine getDamageLineById(int id) {
        return damageLineRepository.findById(id);
    }

    @Transactional
    public void createDamageLine(DamageLine damageLine) {
        damageLineRepository.save(damageLine);
    }

    @Transactional
    public void updateDamageLine(DamageLine damageLine) {
        damageLineRepository.update(damageLine);
    }

    @Transactional
    public void deleteDamageLineById(int id) {
        damageLineRepository.deleteById(id);
    }
}