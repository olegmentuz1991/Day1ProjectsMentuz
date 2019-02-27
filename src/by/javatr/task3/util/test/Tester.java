package by.javatr.task3.util.test;
import by.javatr.task2.util.DaysOfAnyYear;
import by.javatr.task3.util.SquareDifference;
import org.junit.Assert;
import org.junit.Test;

import javax.naming.NameNotFoundException;

public class Tester {


    @Test
    public void SquareDifference_Test_Correct_Radius() {
        int a = 73;
        double expected = 2.0;
        double actual = SquareDifference.difference(a);
        Assert.assertEquals(expected, actual, actual);
    }

    @Test
    public void SquareDifference_Test_Null_Number() {
        int a = 5646785;
        double expected = 2.0;
        double actual = SquareDifference.difference(a);
        Assert.assertEquals(expected, actual, actual);
    }

}