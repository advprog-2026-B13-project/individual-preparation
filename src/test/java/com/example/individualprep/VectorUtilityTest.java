package com.example.individualprep;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.example.individualprep.service.VectorUtility;

class VectorUtilityTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void addReturnsEachElementsSum() {
        double[] v1 = { 1.0, -2.0, 3.5 };
        double[] v2 = { 4.0, 2.0, -1.5 };

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(new double[] { 5.0, 0.0, 2.0 }, result, 1e-9);
    }

    @Test
    void addThrowsWhenLengthMismatch() {
        double[] v1 = { 1.0, 2.0 };
        double[] v2 = { 1.0, 2.0, 3.0 };

        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(v1, v2));
    }

    @Test
    void addThrowsWhenNullVectorProvided() {
        double[] v1 = null;
        double[] v2 = { 1.0, 2.0, 3.0 };

        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(v1, v2));
    }
}
