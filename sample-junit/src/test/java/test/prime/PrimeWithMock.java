
package test.prime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import test.calculator.Calculator;


/**
 * PrimeService is dependent of Calculator service. This sample use a Mock to satisfy the dependency.
 * Mock will 1) stub the response and 2) verify that calculator service was called the right way. 
 * 
 * @author svanpe
 */
public class PrimeWithMock {
    @Before
    public void beforeTest() throws Exception{
      classWeTest = new MyPrime();
      
      Calculator mock = Mockito.mock(Calculator.class);
      
      Mockito.when(mock.multiplyOperation(20, 1000)).thenReturn((double) 20000);
      Mockito.when(mock.divideOperation(20000, 100)).thenReturn((double) 200);
      
      classWeTest.setCalculator(mock);
    }
    
    MyPrime classWeTest;
    
    @Test
    public void testPrimeWithAge20() throws Exception {
        Assert.assertEquals(200, classWeTest.comptePrime(20),0.01f); 
        
        Mockito.verify(classWeTest.getCalculator(), Mockito.times(1)).multiplyOperation(20, 1000);
        Mockito.verify(classWeTest.getCalculator(), Mockito.times(1)).divideOperation(20000, 100);
    }
 
}
