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
        Assert.assertEquals(expectedResult, result);;
    }

}
