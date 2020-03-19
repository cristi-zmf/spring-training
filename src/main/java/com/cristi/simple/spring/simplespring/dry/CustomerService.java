package com.cristi.simple.spring.simplespring.dry;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final static float BIG_ORDER_DISCOUNT = 0.2F;
    private final static float FIDELITY_DISCOUNT = 0.2F;

    public float applyOrderDiscount(float price) {
        return price * BIG_ORDER_DISCOUNT;
    }
    public float applyFidelityDiscount(float price) {
        return price * FIDELITY_DISCOUNT;
    }
}
