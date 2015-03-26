import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Chris Campo
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        // Arrange
        final int a = 1;
        final int b = 2;

        // Act
        final int sum = calculator.add(a, b);

        // Assert
        final int expected = 3;
        assertEquals("Incorrect sum", expected, sum);
    }

    @Test
    public void testMultiply() {
        final int a = 2;
        final int b = 4;
        final int product = calculator.multiply(a, b);
        final int expected = 8;
        assertEquals("Incorrect product", expected, product);
    }

    @Test
    public void testDivide() {
        final int a = 10;
        final int b = 5;
        final int quotient = calculator.divide(a, b);
        final int expected = 2;
        assertEquals("Incorrect quotient", expected, quotient);
    }

    @Test
    public void testMemory() {
        // Multiple asserts can be OK in some circumstances
        assertEquals("Memory not initialized properly", 0, calculator.getMemory());
        calculator.setMemory(10);
        assertEquals("Memory not set properly", 10, calculator.getMemory());
    }
}
