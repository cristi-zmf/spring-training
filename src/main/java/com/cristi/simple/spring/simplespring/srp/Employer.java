package com.cristi.simple.spring.simplespring.srp;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class Employer {
    @Id
    private Long id;
    private final String employerName;
    private final String employerAddress;

    public Employer(String employerName, String employerAddress) {
        this.employerName = employerName;
        this.employerAddress = employerAddress;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }
}
