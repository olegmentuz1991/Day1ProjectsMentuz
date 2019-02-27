package by.javatr.task6.util.test;

import by.javatr.task6.util.HoursMinutesSecondsOfTheDay;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;


public class Tester {


    @Test
    public void HoursMinutesSecondsOfTheDay_Test_True_Numbers() {
        int a = 90000;
        int b = 3600;
        ArrayList<Integer> expected = HoursMinutesSecondsOfTheDay.timer(a);
        ArrayList<Integer> actual = HoursMinutesSecondsOfTheDay.timer(b);
        Assert.assertArrayEquals(expected.toArray(),actual.toArray());
    }
    @Test(expected=NullPointerException.class)
    public void should_fail() throws Exception
    {
        Integer a = null;
        HoursMinutesSecondsOfTheDay.timer(a);
    }

}