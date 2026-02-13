package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {

    public double add(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double subtract(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double multiply(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double divide(double o1, double divisor) {
        if (divisor == 0.0) throw new IllegalArgumentException("Divisor should not be zero!");

        return o1 / divisor;
    }

    public double exponent(double o1, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative exponent is not supported.");
        }
        if (n == 0) {
            return 1.0;
        }

        // Binary Exponentiation
        double result = exponent(o1, n / 2);
        result *= result;

        if (n % 2 == 1) {
            result *= o1;
        }

        return result;
    }
}
