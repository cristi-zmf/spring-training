package com.cristi.simple.spring.simplespring.jparepo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphoneTotalRamCalculator {
    private Smartphones smartphonesJpaRepository;

    public SmartphoneTotalRamCalculator(Smartphones smartphonesJpaRepository) {
        this.smartphonesJpaRepository = smartphonesJpaRepository;
    }

    public int calculateTotalRamOfAllSmartphones() {
        List<Smartphone> allSmartphonesFromDb = smartphonesJpaRepository.findAll();
//        int sum = 0;
//
//        for (Smartphone smartphone : allSmartphonesFromDb) {
//            sum = sum + Integer.parseInt(smartphone.getRamMemory());
//        } //traditional
//
//        //functional java8
//        sum = allSmartphonesFromDb.stream()
//                .map(smarthphone -> smarthphone.getRamMemory())
//                .mapToInt(ram -> Integer.parseInt(ram))
//                .sum();
        //Calculates sum of all ram
        return allSmartphonesFromDb.stream()
                .map(Smartphone::getRamMemory)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
