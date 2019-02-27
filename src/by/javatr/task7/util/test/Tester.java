package by.javatr.task7.util.test;
import by.javatr.task1.util.LastNumberSquareCalculation;
import by.javatr.task7.util.PointsDistance;
import org.junit.Assert;
import org.junit.Test;

public class Tester{
    @Test
    public void Points_Test_TheSamePoint() {
        double expected = 0.0;
        double actual = PointsDistance.pointDistance(1,1,1,1);
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void LastNumberSquareCalculation_Test_Big_Number() {
        double expected = 1.0;
        double actual = PointsDistance.pointDistance(1,1,1,2);
        Assert.assertEquals(expected,actual,0);
    }
}
