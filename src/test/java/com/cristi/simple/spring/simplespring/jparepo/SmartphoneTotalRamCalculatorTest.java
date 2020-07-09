package com.cristi.simple.spring.simplespring.jparepo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
//Unit Test, does not use Spring Context
class SmartphoneTotalRamCalculatorTest {

    @Test
    void calculateTotalRamOfAllSmartphones() {
        Smartphone iphone = new Smartphone("Apple", "X", "3");
        Smartphone phone2 = new Smartphone("Samsung", "S20", "16"); // x pe asta
        Smartphone phone3 = new Smartphone("Huawei", "P40", "8");
        Smartphone phone4 = new Smartphone("Samsung", "S10 Lite", "8"); //X pe asta
        List<Smartphone> phonesToSaveInDB = Arrays.asList(iphone, phone2, phone3, phone4);



        Smartphones smartphones = Mockito.mock(Smartphones.class); //Mockito
        Mockito.when(smartphones.findAll()).thenReturn(phonesToSaveInDB);
        SmartphoneTotalRamCalculator calculator = new SmartphoneTotalRamCalculator(smartphones);

        int totalRamOfAllSmartphones = calculator.calculateTotalRamOfAllSmartphones();
        assertThat(totalRamOfAllSmartphones).isEqualTo(35);
        System.out.println("Total ram is " + totalRamOfAllSmartphones);
    }
}