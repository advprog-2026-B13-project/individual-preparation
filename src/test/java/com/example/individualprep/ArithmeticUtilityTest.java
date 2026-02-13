package com.example.individualprep;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.individualprep.service.ArithmeticUtility;

class ArithmeticUtilityTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void addReturnsCorrectSum() {
        double result = arithmeticUtility.add(10.5, 4.5);

        assertEquals(15.0, result, 1e-9);
    }

    @Test
    void addHandlesNegativeNumbers() {
        double result = arithmeticUtility.add(-5.0, -2.5);

        assertEquals(-7.5, result, 1e-9);
    }

    @Test
    void addReturnsValueWhenAddingZero() {
        double result = arithmeticUtility.add(0.0, 99.9);
        assertEquals(99.9, result, 1e-9);
    }
}