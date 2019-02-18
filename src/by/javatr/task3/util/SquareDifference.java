package by.javatr.task3.util;

import by.javatr.scanner.EnterTheNumber;


public class SquareDifference {
    public static double squareOfBigSquare = EnterTheNumber.enterInt();

    /**
     * @return double
     */
    public static double squareOfCircle() {
        double circleSquare = Math.PI*Math.pow(Math.sqrt(squareOfBigSquare)/2, 2);
        return circleSquare;
    }

    /**
     * @return double
     */
    public static double squareOfLittleSquare() {
        double littleSquare = 2*squareOfCircle()/Math.PI;
        return littleSquare;
    }

    /**
     * @return double
     */
    public static double difference() {
        double dif = squareOfBigSquare/(squareOfLittleSquare());
        return dif;
    }
}
