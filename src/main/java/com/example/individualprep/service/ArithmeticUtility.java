package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {

    public double add(Double o1, Double o2) {
        if (o1 == null) {
            throw new IllegalArgumentException("Angka pertama tidak bisa null");
        }

        if (o2 == null) {
            throw new IllegalArgumentException("Angka kedua tidak bisa null");
        }

        return o1 + o2;
    }

    public double subtract(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double multiply(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
    }

    public double divide(double o1, double o2) {
        // TODO: Implement me properly!
        return 0.0;
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
