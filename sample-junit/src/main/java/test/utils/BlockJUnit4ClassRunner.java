package test.utils;

import java.util.List;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

/**
 * JUnit test runner allowing to define test case name with an annotation (see {@link Test} annotation) .
 * 
 * @author svanpe
 */
public class BlockJUnit4ClassRunner extends org.junit.runners.BlockJUnit4ClassRunner {

    /**
     * @param klass
     * @throws InitializationError
     */
    public BlockJUnit4ClassRunner(Class<?> klass) throws InitializationError {
        super(klass);

    }

    protected String testName(FrameworkMethod method) {

        Test testAnnotation = method.getAnnotation(Test.class);

        if (testAnnotation != null) {
            return testAnnotation.name();
        }

        return super.testName(method);

    }
    
    protected List<FrameworkMethod> computeTestMethods() {
//        List<FrameworkMethod> methods =  getTestClass().getAnnotatedMethods(org.junit.Test.class);
//        methods.addAll(getTestClass().getAnnotatedMethods(Test.class));
//        
        
        List<FrameworkMethod> methods =  getTestClass().getAnnotatedMethods(Test.class);
        
        return methods;
    }
}
