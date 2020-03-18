package com.cristi.simple.spring.simplespring.srp;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class GoodEmployerService {
    public void saveEmployer(Employer employer) {
        System.out.println("saving employer and nothing else" + employer);
    }
}
