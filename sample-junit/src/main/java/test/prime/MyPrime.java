package test.prime;

import test.calculator.Calculator;
import test.calculator.ZeroDivisorException;

/**
 * A prime is calculated on the age.
 * 
 * @author svanpe
 */
public class MyPrime {

    Calculator calculator;

    /**
     * @return the calculator
     */
    public Calculator getCalculator() {
        return this.calculator;
    }

    /**
     * @param calculator the calculator to set
     */
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public double comptePrime(int age) throws ZeroDivisorException {
        double basicPrime = 1000f;

        return getCalculator().divideOperation(getCalculator().multiplyOperation(age, basicPrime), 100);

    }
}
