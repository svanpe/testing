package test.calculator;

import org.junit.Assert;
import org.junit.Test;


/**
 * 3. Now we have one method per test. After reading the surefire-report, we know what was tested.
 * 
 * @author svanpe
 */
public class CalculatorMethodsTest {

    Calculator calculator = new GoodCalculator();
    
    @Test
    public void testAdditionOperation() throws Exception {
        Assert.assertEquals(7.00f, calculator.addOperation(2.00f, 5.00f), 0.00f);    
    }
    
    @Test
    public void testSubstractOperation() throws Exception  {
        Assert.assertEquals(1.00f, calculator.substractOperation(6.00f, 5.00f), 0.00f);    
    }
    
    @Test
    public void testMultiplyOperation() throws Exception {
        Assert.assertEquals(10.00f,calculator.multiplyOperation(2.00f, 5.00f), 0.00f);    
    }
    
    @Test
    public void testDivideOperation() throws Exception {
        Assert.assertEquals(2.00f,calculator.divideOperation(10.00f, 5.00f), 0.00f);    
    }
    
    @Test(expected = ZeroDivisorException.class)
    public void testDivideOperationWithZero() throws Exception {
        calculator.divideOperation(10.00f, 0.00f);    
    }
    
    
}
