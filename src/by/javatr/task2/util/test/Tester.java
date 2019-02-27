package by.javatr.task2.util.test;
import by.javatr.task1.util.LastNumberSquareCalculation;
import by.javatr.task2.util.DaysOfAnyYear;
import org.junit.Assert;
import org.junit.Test;

public class Tester {
    @Test
    public void DaysOfAnyYear_Test_Correct_Year() {
        int a  = 2;
        int b = 2000;
        int expected = 29;
        int actual = DaysOfAnyYear.daysOfAnyYear(a,b);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void DaysOfAnyYear_Test_Null_Number() {
        int a = 0;
        int b = 0;
        int expected = 0;
        int actual = DaysOfAnyYear.daysOfAnyYear(a,b);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void DaysOfAnyYear_Test_Negative_Number() {
        int a = -6;
        int b = -8;
        int expected = 0;
        int actual = DaysOfAnyYear.daysOfAnyYear(a,b);
        Assert.assertEquals(expected,actual);
    }
}
