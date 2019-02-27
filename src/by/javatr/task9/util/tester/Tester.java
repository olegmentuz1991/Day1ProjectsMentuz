package by.javatr.task9.util.tester;
import by.javatr.task8.util.FunctionCalculator;
import by.javatr.task9.util.CircleParameters;
import org.junit.Assert;
import org.junit.Test;

public class Tester {
    @Test
    public void CircleParameters_Test_Right_Square() {
        int a = 3;
        double expected = 28.26;
        double actual = CircleParameters.circleSquare(a);
        Assert.assertEquals(expected,actual,0.2);
    }
    @Test
    public void CircleParameters_Test_Right_Length() {
        int a = 3;
        double expected = 18.84;
        double actual = CircleParameters.circleLength(a);
        Assert.assertEquals(expected,actual,0.2);
    }

}
