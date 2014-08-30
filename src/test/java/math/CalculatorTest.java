package math;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by stefanz on 30.08.14.
 */
public class CalculatorTest {

    @Test
    public void addTwoNumbers() {
        Calculator calc = new Calculator();
        int result = calc.plus(5, 7);
        Assert.assertEquals(12, result);
    }

    @Test
    public void addZero() {
        Calculator calc = new Calculator();
        int result = calc.plus(8, 0);
        Assert.assertEquals(8, result);
    }
}
