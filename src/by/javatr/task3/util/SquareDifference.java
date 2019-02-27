package by.javatr.task3.util;

public class SquareDifference {

    /**
     *
     * @param square
     * @return
     */
    public static double squareOfCircle(int square) {
        double circleSquare = Math.PI*Math.pow(Math.sqrt(square)/2, 2);
        return circleSquare;
    }

    /**
     *
     * @param square
     * @return
     */
    public static double squareOfLittleSquare(int square) {
        double littleSquare = 2*squareOfCircle(square)/Math.PI;
        return littleSquare;
    }

    /**
     *
     * @param square
     * @return
     */
    public static double difference(int square) {
        double dif = square/(squareOfLittleSquare(square));
        return dif;
    }
}
