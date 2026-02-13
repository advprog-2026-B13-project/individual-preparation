package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {

    public double[] add(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Vectors must not be null.");
        }
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }

        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }

    public double[] subtract(double[] v1, double[] v2) {
        if (v1 == null) throw new IllegalArgumentException("Vector v1 should not be null");
        if (v2 == null) throw new IllegalArgumentException("Vector v2 should not be null");

        if (v1.length != v2.length) throw new IllegalArgumentException("Vector v1 and v2 should have the same dimension");

        int dimension = v1.length;
        double[] resultVector = new double[dimension];

        for (int index = 0; index < dimension; index++) {
            double subtractResult = v1[index] - v2[index];
            resultVector[index] = subtractResult;
        }

        return resultVector;
    }

    public double[] multiply(double[] v1, int x) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }

    public double dotProduct(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException("Vector tidak boleh null");
        }

        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Panjang vektor harus sama");
        }

        double result = 0.0;
        for (int i = 0; i < v1.length; i++) {
            result += v1[i] * v2[i];
        }

        return result;
    }

    public double norm(double[] v1) {
        if (v1 == null || v1.length == 0) {
            throw new IllegalArgumentException("Vector should not be null");
        }


        double sum = 0.0;
        for (double component : v1) {
            sum += component * component;
        }

        return Math.sqrt(sum);
    }
}