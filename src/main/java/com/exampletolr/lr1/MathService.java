package com.exampletolr.lr1;

import org.springframework.stereotype.Component;

@Component
public class MathService {

    public double calculatePower(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}
