package org.example;

public class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) throws IllegalArgumentException, ArithmeticException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Both arguments must be positive.");
        }
        return a + b;
    }
}
