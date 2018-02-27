package test.calculator;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Data driven test : implement one test method for several scenarios.
 * 
 * @author svanpe
 */
@RunWith(Parameterized.class)
public class CalculatorDataDrivenTest {

    @Parameters(name = "{index}: {0} operation {1}  with {2} and {3} expecting {4}")
    public static List<String[]> parameters() {

        String[][] table = {{"add operation ", "ADD", "1", "1", "2" }
                            , {"sub operation ", "SUB", "5", "4", "1" }
                            , {"mul operation ", "MUL", "5", "4", "20" } 
                            , {"div operation ", "DIV", "10", "2", "5" }
                            , {"check div by 0 ", "DIV", "10", "0", null }
                            };

        return Arrays.asList(table);
    }
    
    Calculator calculator = new GoodCalculator();
    
    String name;
    String operation;
    String leftOperand;
    String rightOperand;
    String expectedResult;
    
    public CalculatorDataDrivenTest(String name, String operation, String leftOperand, String rightOperand, String expectedResult){
        
        this.name= name;
        this.operation = operation;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.expectedResult = expectedResult;
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test() throws Exception {
        
        double result = 0; 

        if(expectedResult==null){
            exception.expect(ZeroDivisorException.class); 
        }
        
        if(operation.compareToIgnoreCase("ADD")==0){
            result = calculator.addOperation(Double.parseDouble(leftOperand), Double.parseDouble(rightOperand));
        }
        
        if(operation.compareToIgnoreCase("SUB")==0){
            result = calculator.substractOperation(Double.parseDouble(leftOperand), Double.parseDouble(rightOperand));
        }
        
        if(operation.compareToIgnoreCase("MUL")==0){
            result = calculator.multiplyOperation(Double.parseDouble(leftOperand), Double.parseDouble(rightOperand));
        }
        
        if(operation.compareToIgnoreCase("DIV")==0){
            result = calculator.divideOperation(Double.parseDouble(leftOperand), Double.parseDouble(rightOperand));
        }
        
        if(expectedResult!=null){
            Assert.assertEquals(Double.parseDouble(expectedResult), result, 0.01);    
        }
        
    }
}
