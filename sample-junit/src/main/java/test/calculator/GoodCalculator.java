package test.calculator;

/**
 * Correct implementation of calculator for green tests.
 * 
 * @author svanpe
 */
public class GoodCalculator implements Calculator {

    /**
     * {@inheritDoc}
     */
    @Override
    public double addOperation(double a, double b) {
        return a + b;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double substractOperation(double a, double b) {
        return a - b;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double multiplyOperation(double a, double b) {
        return a * b;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double divideOperation(double a, double b) throws ZeroDivisorException {
        
        if(b==0.0f) throw new ZeroDivisorException();
        
        return a / b;
    }

}
