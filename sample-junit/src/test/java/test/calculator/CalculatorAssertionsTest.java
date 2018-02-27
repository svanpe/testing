package test.calculator;

import org.junit.Assert;
import org.junit.Test;


/**
 * 2. It's much better with assertions, isn't it?
 * 
 * @author svanpe
 */
public class CalculatorAssertionsTest {
    
    @Test
    public void testCalculatorWithAssertions() throws Exception {
        
        Calculator calculator = new GoodCalculator();
        
        Assert.assertEquals(7.00f, calculator.addOperation(2.00f, 5.00f), 0.00f);
        Assert.assertEquals(1.00f, calculator.substractOperation(6.00f, 5.00f), 0.00f);
        Assert.assertEquals(10.00f,calculator.multiplyOperation(2.00f, 5.00f), 0.00f);
        Assert.assertEquals(2.00f,calculator.divideOperation(10.00f, 5.00f), 0.00f);
    }

}
