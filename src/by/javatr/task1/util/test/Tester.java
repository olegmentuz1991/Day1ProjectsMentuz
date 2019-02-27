package by.javatr.task1.util.test;
import by.javatr.task1.util.LastNumberSquareCalculation;
import org.junit.Assert;
import org.junit.Test;

public class Tester{
    @Test
    public void LastNumberSquareCalculation_Test_Right_Number() {
        int a  = 3;
        int expected = 9;
        int actual = LastNumberSquareCalculation.caseNumbers(a);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void LastNumberSquareCalculation_Test_Null_Number() {
        int a = 0;
        int expected = 0;
        int actual = LastNumberSquareCalculation.caseNumbers(a);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void LastNumberSquareCalculation_Test_Big_Number() {
        int a = (int)432632456;
        int expected = 0;
        int actual = LastNumberSquareCalculation.caseNumbers(a);
        Assert.assertEquals(expected,actual);
    }
}
