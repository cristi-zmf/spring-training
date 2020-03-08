package com.cristi.simple.spring.simplespring.jparepo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional //because DB need transactions hurray!
class SmartphonesLocalIT {
    @Autowired
    private Smartphones smartphones;
    @Autowired
    private TransactionTemplate txTemplate;

    @Test
    void should_save_entity() {
        Smartphone iphone = new Smartphone("Apple", "X", "3GB");
        txTemplate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        smartphones.saveAndFlush(iphone);
        Smartphone iphoneFromRepo = smartphones.getOne(iphone.getId());
        assertThat(iphoneFromRepo).isEqualToComparingFieldByField(iphone);
    }

    @Test
    void should_not_have_smartphone_in_db_because_of_transactional() {
        assertThat(smartphones.findAll()).isEmpty();
    }
}
