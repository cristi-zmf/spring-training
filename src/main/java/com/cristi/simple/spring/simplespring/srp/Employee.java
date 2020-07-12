package com.cristi.simple.spring.simplespring.srp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private String name;
    private BigDecimal salary;
}
