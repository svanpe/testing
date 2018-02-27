package test.calculator;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import test.utils.BlockJUnit4ClassRunner;
import test.utils.Test;



/**
 * 4. Something better than test methods names. 
 * 
 * @author svanpe
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class CalculatorNiceMethodsTest {

    Calculator calculator = new GoodCalculator();
    
    @Test(name="calculator addition operation")
    public void testAdditionOperation() throws Exception {
        Assert.assertEquals(7.00f, calculator.addOperation(2.00f, 5.00f), 0.00f);    
    }
    
    @Test(name="calculator substraction operation")
    public void testSubstractOperation() throws Exception  {
        Assert.assertEquals(1.00f, calculator.substractOperation(6.00f, 5.00f), 0.00f);    
    }
    
    @Test(name="calculator multiply operation")
    public void testMultiplyOperation() throws Exception {
        Assert.assertEquals(10.00f,calculator.multiplyOperation(2.00f, 5.00f), 0.00f);    
    }
    
    @Test(name="calculator divide operation")
    public void testDivideOperation() throws Exception {
        Assert.assertEquals(2.00f,calculator.divideOperation(10.00f, 5.00f), 0.00f);    
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test(name="calculator divide by zero must throw exception")
    public void testDivideOperationWithZero() throws Exception {
        exception.expect(ZeroDivisorException.class);
        calculator.divideOperation(10.00f, 0.00f);    
    }
    
    
}
