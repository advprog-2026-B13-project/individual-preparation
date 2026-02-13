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
}
