package by.javatr.task8.util;

public class FunctionCalculator {
    /**
     *
     * @param functionArgument
     * @return double
     */
    public static double functionCalculate(int functionArgument) {
        double result;
        if (functionArgument>=3) {
           result = ((-Math.pow(functionArgument, 2)) + (3*functionArgument) + 9);
        } else {
            result = 1/(Math.pow(functionArgument, 3) - 6);
        }
        return result;
    }
}
