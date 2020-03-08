package com.cristi.simple.spring.simplespring.exercises.ex5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class ShoppingCentreLocalIT {
    @Autowired
    private ShoppingCentre sut; //sut = System under test

    @Test
    void findPantsBySize() {
        List<Pants> pantsBySize = sut.findPantsBySize(30);
        assertThat(pantsBySize).hasSize(1);
        Pants pants = pantsBySize.get(0);
        assertThat(pants.getSize()).isEqualTo(30);
    }

    @Test
    void showMePantsByBrand() {
        List<Pants> pantsBySize = sut.showMePantsByBrand("ZARA");
        assertThat(pantsBySize).hasSize(1);
        Pants pants = pantsBySize.get(0);
        assertThat(pants.getBrand()).isEqualTo("ZARA");

    }
}
