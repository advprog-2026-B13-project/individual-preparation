package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

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
    void addThrowsExceptionWhenFirstArgumentIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            arithmeticUtility.add(null, 5.0);
        });

        assertEquals("Angka pertama tidak bisa null", exception.getMessage());
    }

    @Test
    void addThrowsExceptionWhenSecondArgumentIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            arithmeticUtility.add(5.0, null);
        });

        assertEquals("Angka kedua tidak bisa null", exception.getMessage());
    }
}
