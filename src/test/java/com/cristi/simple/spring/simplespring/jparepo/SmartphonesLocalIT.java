package com.cristi.simple.spring.simplespring.jparepo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional //because DB need transactions hurray!
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SmartphonesLocalIT { //IT -> IntegrationTest, Local -> runs with a local in memory DB (h2)
    @Autowired
    private Smartphones smartphones; //Spring Data JPA repository

    @Test
    @Order(1)
    void should_save_entity() {
        Smartphone iphone = new Smartphone("Apple", "X", "3GB");
        Assertions.assertThat(iphone.getId()).isNull();
        smartphones.saveAndFlush(iphone);
        Assertions.assertThat(iphone.getId()).isNotNull();
        Assertions.assertThat(iphone.getId()).isOne();
        Smartphone iphoneFromRepo = smartphones.getOne(iphone.getId());
        assertThat(iphoneFromRepo).isEqualToComparingFieldByField(iphone);
        assertThat(smartphones.findAll()).isNotEmpty();
        assertThat(smartphones.findAll()).hasSize(1);
    }
    @Test
    void should_find_all_phones_with_a_certain_brand() {
        Smartphone iphone = new Smartphone("Apple", "X", "3GB");
        Smartphone phone2 = new Smartphone("Samsung", "S20", "16GB"); // x pe asta
        Smartphone phone3 = new Smartphone("Huawei", "P40", "8GB");
        Smartphone phone4 = new Smartphone("Samsung", "S10 Lite", "8GB"); //X pe asta
        List<Smartphone> phonesToSaveInDB = Arrays.asList(iphone, phone2, phone3, phone4);

//        for (Smartphone smartphone : phonesToSaveInDB) { // Traditional way
//            smartphones.saveAndFlush(smartphone);
//        }
//
//        //Functional way (java 8 and above), the cool way
//        phonesToSaveInDB.forEach(smartphones::saveAndFlush);

        smartphones.saveAll(phonesToSaveInDB);
        smartphones.flush();
        System.out.println("Printing all phones " + smartphones.findAll());
        System.out.println(smartphones.findAll());
        System.out.println("Printing only samsung phones " + smartphones.findByBrandIgnoreCase("samsung"));
        System.out.println(smartphones.findByBrandIgnoreCase("samsung"));
        while (true) {
            //pretend to work
        }
    }

    @Test
    @Order(2)
    void should_not_have_smartphone_in_db_because_of_transactional() {
        assertThat(smartphones.findAll()).isEmpty();
    }
}
