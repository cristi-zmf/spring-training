package com.cristi.simple.spring.simplespring.jparepo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional //because DB need transactions hurray!
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SmartphonesLocalIT {
    @Autowired
    private Smartphones smartphones;

    @Test
    @Order(1)
    void should_save_entity() {
        Smartphone iphone = new Smartphone("Apple", "X", "3GB");
        smartphones.saveAndFlush(iphone);
        Smartphone iphoneFromRepo = smartphones.getOne(iphone.getId());
        assertThat(iphoneFromRepo).isEqualToComparingFieldByField(iphone);
        assertThat(smartphones.findAll()).isNotEmpty();
    }

    @Test
    @Order(2)
    void should_not_have_smartphone_in_db_because_of_transactional() {
        assertThat(smartphones.findAll()).isEmpty();
    }
}
