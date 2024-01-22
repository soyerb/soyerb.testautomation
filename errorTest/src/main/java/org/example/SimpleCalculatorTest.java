package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleCalculatorTest {
    private final Calculator calculator = new SimpleCalculator();

    @Test
    public void testAddWithValidParameters() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddWithNegativeArguments() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.add(-2, 3));
        assertEquals("Both arguments must be positive.", exception.getMessage());
    }

    @Test
    public void testAddWithOverflow() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 1));
        assertEquals("Integer overflow", exception.getMessage());
    }
}
