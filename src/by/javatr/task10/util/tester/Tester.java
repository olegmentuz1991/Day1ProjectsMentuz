package by.javatr.task10.util.tester;
import by.javatr.task10.util.TableFunctionCalculator;
import by.javatr.task9.util.CircleParameters;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Tester {
    @Test
    public void CircleParameters_Test_Right_Tangens() {
        int a = 1;
        double expected = 1.557;
        double actual = TableFunctionCalculator.tangensFunctionFormat(a);
        Assert.assertEquals(expected,actual,0.01);

    }
}
