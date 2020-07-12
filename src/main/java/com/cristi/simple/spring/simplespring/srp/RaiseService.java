package com.cristi.simple.spring.simplespring.srp;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class RaiseService {
    public BigDecimal calculateRaise(Employee employee) {
        System.out.println("Calculating big raise");
        return employee.getSalary()
                .multiply(BigDecimal.valueOf(Math.random()));
    }
}
