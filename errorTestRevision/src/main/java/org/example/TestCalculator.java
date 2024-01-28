package org.example;
import static org.junit.Assert.assertEquals;

public class TestCalculator {
    public void testDivide() {
        Calculator calculator = new Calculator();
        try {
            int result = calculator.divide(10, 2);
            assertEquals(5, result);
        } catch (ArithmeticException e) {
            // Handle the exception here
            System.out.println(e.getMessage());
        }
    }
}
