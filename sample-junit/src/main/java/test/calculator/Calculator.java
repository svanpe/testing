package test.calculator;

/**
 * Calculator service interface.
 * 
 * @author svanpe
 */
public interface Calculator {

    public abstract double addOperation(double a, double b);

    public abstract double substractOperation(double a, double b);

    public abstract double multiplyOperation(double a, double b);

    public abstract double divideOperation(double a, double b) throws ZeroDivisorException;

}