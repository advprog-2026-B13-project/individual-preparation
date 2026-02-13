package com.example.individualprep;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.individualprep.service.VectorUtility;

class VectorUtilityTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testNormPositiveCase() {
        double[] v1 = { 3.0, 4.0, 0.0 };
        double result = vectorUtility.norm(v1);
        assertEquals(5.0, result, 1e-9);
    }

    @Test
    void testNormNegativeCase() {
        double[] v1 = null;
        double result = vectorUtility.norm(v1);
        assertEquals(0.0, result, 1e-9);
    }

    @Test
    void testNormEdgeCase() {
        double[] v1 = {};
        double result = vectorUtility.norm(v1);
        assertEquals(0.0, result, 1e-9);
    }
}