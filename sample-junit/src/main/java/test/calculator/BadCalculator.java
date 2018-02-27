package test.calculator;

/**
 * Bad implementation of calculator to simulate failures in tests.
 * 
 * @author svanpe
 */
public class BadCalculator implements Calculator{

    public double addOperation(double a, double b) {
        return a + b - 1;
    }

    public double substractOperation(double a, double b) {
        return a - b + 1;
    }

    public double multiplyOperation(double a, double b) {
        return a * b * 2;
    }

    public double divideOperation(double a, double b) throws ZeroDivisorException {
        
        if(b==0.0f) throw new ZeroDivisorException();
        
        return (a + 1) / b;
    }

}
