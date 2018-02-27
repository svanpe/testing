package test.calculator;

import org.junit.Test;


/**
 * 1. Ridiculous test. But 100% coverage reached for Calculator.
 * 
 * @author svanpe
 */
public class CalculatorTest {
    
    @Test
    public void testCalculator() throws Exception {
        
        Calculator calculator = new GoodCalculator();
        
        System.out.println(calculator.addOperation(2.00f, 5.00f));
        System.out.println(calculator.substractOperation(6.00f, 5.00f));
        System.out.println(calculator.multiplyOperation(2.00f, 5.00f));
        System.out.println(calculator.divideOperation(10.00f, 5.00f));
    }

}
