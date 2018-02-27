package test.prime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import test.calculator.Calculator;
import test.calculator.GoodCalculator;

/**
 * PrimeService is dependent of Calculator service. This sample use a Spy to satisfy the dependency.
 * Spy is in fact the concrete implementation but we can verify the correct use of the calculator service. 
 * 
 * @author svanpe
 */
public class PrimeWithSpy {

    @Before
    public void beforeTest() throws Exception {
        classWeTest = new MyPrime();

        Calculator spy = Mockito.spy(GoodCalculator.class);

        classWeTest.setCalculator(spy);
    }

    MyPrime classWeTest;

    @Test
    public void testPrimeWithAge20() throws Exception {
        Assert.assertEquals(200, classWeTest.comptePrime(20), 0.01f);

        Mockito.verify(classWeTest.getCalculator(), Mockito.times(1)).multiplyOperation(20, 1000);
        Mockito.verify(classWeTest.getCalculator(), Mockito.times(1)).divideOperation(20000, 100);
    }
}
