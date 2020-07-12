package com.cristi.simple.spring.simplespring.srp;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class EmployerService {
    private final EmployerRepo employerRepo;
    private final BigDecimal raiseFactor = BigDecimal.valueOf(0.3);

    public EmployerService(EmployerRepo employerRepo) {
        this.employerRepo = employerRepo;
    }

    public String findEmployeeAge() {
        System.out.println("finding employee's age");
        return "forever young";
    }
    public void saveEmployer(Employer employer) {
        System.out.println("saving employer " + employer);
        employer.setRaiseFactor(raiseFactor);
        employerRepo.saveAndFlush(employer);
    }
    public BigDecimal calculateRaise(Employee employee) {
        System.out.println("Calculating big raise");
        BigDecimal sumToIncrease = employee.getSalary()
                .multiply(raiseFactor);
        return employee.getSalary()
                .add(sumToIncrease);
    }
}
