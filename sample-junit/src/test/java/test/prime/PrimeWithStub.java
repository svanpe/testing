
package test.prime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import test.calculator.Calculator;
import test.calculator.ZeroDivisorException;


/**
 * PrimeService is dependent of Calculator service. This sample use a stub to satisfy the dependency.
 * Stub is a minimal implementation to satisfy the SUT.
 * 
 * @author svanpe
 */
public class PrimeWithStub {

    public class CalculatorStub implements Calculator {

        /**
         * {@inheritDoc}
         */
        @Override
        public double addOperation(double a, double b) {
            
            return 0;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public double substractOperation(double a, double b) {
           
            return 0;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public double multiplyOperation(double a, double b) {
           
            return a*b;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public double divideOperation(double a, double b) throws ZeroDivisorException {
            
            return a/b;
        }
        
    }
    
    @Before
    public void beforeTest(){
      classWeTest = new MyPrime();
      classWeTest.setCalculator(new CalculatorStub());
    }
    
    MyPrime classWeTest;
    
    @Test
    public void testPrimeWithAge20() throws Exception {
        Assert.assertEquals(200, classWeTest.comptePrime(20),0.01f); 
    }
}
