package calculator;

import org.junit.*;

public class CalculatorTests {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = 100;
        int b = 100;
        int expectedResult = 200;
        long result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        int a = 100;
        int b = 100;
        int expectedResult = 0;
        long result = calculator.subtract(100, 100);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        int a = 100;
        int b = 100;
        long expectedResult = 10000;
        long result = calculator.multiply(a, b);
        Assert.assertEquals(expectedResult, result);;
    }

    @Test
    public void testDivide() {
        int a = 100;
        int b = 100;
        double expectedResult = 1.0;
        double result = calculator.divide(a, b);
        Assert.assertEquals(expectedResult, result,0.00005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 100;
        int b = 0;
        calculator.divide(a, b);
    }
}
