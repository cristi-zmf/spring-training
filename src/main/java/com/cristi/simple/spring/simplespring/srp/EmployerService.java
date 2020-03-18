package com.cristi.simple.spring.simplespring.srp;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class EmployerService {
    public String findEmployeeAge() {
        System.out.println("finding employee's age");
        return "forever young";
    }
    public void saveEmployer(Employer employer) {
        System.out.println("saving employer " + employer);
    }
    public BigDecimal calculateRaise(String employee) {
        System.out.println("Calculating big raise");
        return BigDecimal.ZERO;
    }
}
