package com.cristi.simple.spring.simplespring.srp;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class EmployerServiceTest {

    EmployerService employerService = new EmployerService(Mockito.mock(EmployerRepo.class));

    @Test
    void testCalculateRaise() {
        BigDecimal raisedSalary = employerService.calculateRaise(new Employee("name", new BigDecimal(1000)));
        assertThat(raisedSalary.doubleValue())
                .isEqualTo(1300);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme