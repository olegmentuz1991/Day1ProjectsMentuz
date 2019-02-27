package by.javatr.task4.util.test;
import by.javatr.task3.util.SquareDifference;
import by.javatr.task4.util.OddEven;
import org.junit.Assert;
import org.junit.Test;

public class Tester {


    @Test
    public void OddEven_Test_True_Numbers() {
        int [] a = {1,2,3,4};
        boolean expected = true;
        boolean actual = OddEven.twoEvenSuccess(a);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void OddEven_Test_False_Numbers() {
        int [] a = {1,3,5,7};
        boolean expected = false;
        boolean actual = OddEven.twoEvenSuccess(a);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void OddEven_Test_Big_Number() {
        int [] a = {(int)134534534534L,3,5,7};
        boolean expected = false;
        boolean actual = OddEven.twoEvenSuccess(a);
        Assert.assertEquals(expected,actual);
    }

}