package by.javatr.task9.util;


public class CircleParameters {

    /**
     *
     * @param radius
     * @return double
     */
    public static double circleLength(double radius) {
       double length = 2*Math.PI*radius;
       return length;
    }

    /**
     *
     * @param radius
     * @return double
     */
    public static double circleSquare(double radius) {
        double square = Math.pow(radius, 2)*Math.PI;
        return square;
    }
}
