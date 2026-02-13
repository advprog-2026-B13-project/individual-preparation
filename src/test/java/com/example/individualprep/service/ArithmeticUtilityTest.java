package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void exponentReturnsOneWhenExponentIsZero() {
        double result = arithmeticUtility.exponent(7.5, 0);

        assertEquals(1.0, result, 1e-9);
    }

    @Test
    void exponentReturnsPowerForPositiveExponent() {
        double result = arithmeticUtility.exponent(2.0, 3);

        assertEquals(8.0, result, 1e-9);
    }

    @Test
    void exponentThrowsWhenExponentIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> arithmeticUtility.exponent(2.0, -1));
    }

    @Test
    void subtractReturnsCorrectDifference() {
        double result = arithmeticUtility.subtract(10.0, 4.0);
        assertEquals(6.0, result, 1e-9);
    }

    @Test
    void subtractWorksWithNegativeNumbers() {
        double result = arithmeticUtility.subtract(5.0, -3.0);
        assertEquals(8.0, result, 1e-9);
    }

    @Test
    void testDivide_positiveInputs() {
        double toleranceDelta = 0.0001;

        double num = 2.5;
        double divisor = 5;

        assertEquals(0.5, arithmeticUtility.divide(num, divisor), toleranceDelta);
    }

    @Test
    void testDivide_negativeInputs() {
        double toleranceDelta = 0.0001;

        double num = -1.2;
        double divisor = 2;
        assertEquals(-0.6, arithmeticUtility.divide(num, divisor), toleranceDelta);

        num = 0.6;
        divisor = -3;
        assertEquals(-0.2, arithmeticUtility.divide(num, divisor), toleranceDelta);

        num = -0.5;
        divisor = -0.5;
        assertEquals(1, arithmeticUtility.divide(num, divisor), toleranceDelta);
    }

    @Test
    void testDivide_zeroInputs() {
        double num1 = 10;
        double divisor1 = 0;
        assertThrows(IllegalArgumentException.class, () -> arithmeticUtility.divide(num1, divisor1));

        double num2 = 0;
        double divisor2 = 1.1;
        assertEquals(0.0, arithmeticUtility.divide(num2, divisor2));

        double num3 = 0;
        double divisor3 = 0;
        assertThrows(IllegalArgumentException.class, () -> arithmeticUtility.divide(num3, divisor3));
    }
}
