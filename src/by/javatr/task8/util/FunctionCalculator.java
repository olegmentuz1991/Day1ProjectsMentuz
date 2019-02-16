package by.javatr.task8.util;

import by.javatr.scanner.EnterTheNumber;

public class FunctionCalculator {
    public static int functionArgument = EnterTheNumber.enterInt();
    /**
     * @return double
     */
    public static double functionCalculate() {
        double result = 0;
        if (functionArgument>=3) {
           result = ((-Math.pow(functionArgument, 2)) + (3*functionArgument) + 9);
        } else {
            result = 1/(Math.pow(functionArgument, 3) - 6);
        }
        return result;
    }
}
