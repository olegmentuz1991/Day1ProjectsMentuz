package by.javatr.task9.util;

import by.javatr.scanner.EnterTheNumber;

public class CircleParameters {
    public static double radius = EnterTheNumber.enterDouble();

    /**
     *
     * @return double
     */
    public static double circleLength() {
       double length = 2*Math.PI*radius;
       return length;
    }
    /**
     *
     * @return double
     */
    public static double circleSquare() {
        double square = Math.pow(radius, 2)*Math.PI;
        return square;
    }
}
