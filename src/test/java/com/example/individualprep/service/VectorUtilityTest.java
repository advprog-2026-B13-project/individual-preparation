package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class VectorUtilityTest {
    @InjectMocks
    VectorUtility vectorUtility;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testSubtract_positiveCase() {
        double toleranceDelta = 0.0001;

        double[] vector1 = { 1, 4, 3 };
        double[] vector2 = { 3, 5, 1 };
        double[] subtractResult = vectorUtility.subtract(vector1, vector2);
        assertArrayEquals(new double[] { -2, -1, 2 }, subtractResult, toleranceDelta);

        vector1 = new double[] { 0.3, 1.2, 6.7 };
        vector2 = new double[] { 0.2, 1.9, 4.5 };
        subtractResult = vectorUtility.subtract(vector1, vector2);
        assertArrayEquals(new double[] { 0.1, -0.7, 2.2 }, subtractResult, toleranceDelta);
    }

    @Test
    public void testSubtract_nullInputs() {
        double[] invalid1Vector1 = null;
        double[] invalid1Vector2 = new double[] { 1, 6, 7 };
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(invalid1Vector1, invalid1Vector2));

        double[] invalid2Vector1 = new double[] { 6, 7, 2 };
        double[] invalid2Vector2 = null;
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(invalid2Vector1, invalid2Vector2));

        double[] invalid3Vector1 = null;
        double[] invalid3Vector2 = null;
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(invalid3Vector1, invalid3Vector2));
    }

    @Test
    public void testSubtract_mismatchedLength() {
        double[] invalid4Vector1 = { 1 };
        double[] invalid4Vector2 = { 6, 7 };
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(invalid4Vector1, invalid4Vector2));

        double[] invalid5Vector1 = { 3, 2, 7 };
        double[] invalid5Vector2 = { 5 };
        assertThrows(IllegalArgumentException.class, () -> vectorUtility.subtract(invalid5Vector1, invalid5Vector2));
    }

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

    @Test
    void testNormVector() {
        double[] v1 = { 3.0, 4.0, 0.0 };
        double result = vectorUtility.norm(v1);
        assertEquals(5.0, result, 1e-9);
    }

    @Test
    void testNormVectorNull() {
        double[] v1 = null;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.norm(v1);
        });

        assertEquals("Vector should not be null", exception.getMessage());
    }

    @Test
    void testNormVectorEmpty() {
        double[] v1 = {};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.norm(v1);
        });
        assertEquals("Vector should not be null", exception.getMessage());
    }
}
