package by.javatr.task8.util.test;
import by.javatr.task8.util.FunctionCalculator;
import org.junit.Assert;
import org.junit.Test;

public class Tester {
    @Test
    public void FunctionCalculator_Test_Right_Function() {
        int a = 4;
        double expected = 5.0;
        double actual = FunctionCalculator.functionCalculate(a);
        Assert.assertEquals(expected,actual,0);
    }

}
