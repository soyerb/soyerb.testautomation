package org.example;

import org.junit.Test;

import static junit.framework.TestCase.fail;

public class CalculatorTest {
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        try {
            int result = calculator.divide(10, 0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Handle the exception here
            System.out.println(e.getMessage());
        }
    }
}