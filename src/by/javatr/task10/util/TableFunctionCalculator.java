package by.javatr.task10.util;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class TableFunctionCalculator {
    /**
     *
     * @param argument
     */
    public static double tangensFunctionFormat(int argument) {

            double result = Math.tan(argument);
            return result;
    }
    /**
     *
     * @param argument1
     * @param argument2
     * @param step
     */
    public static void tangensFormater(int argument1, int argument2, int step ){
        String leftAlignFormat = "| %-9s | %-10s |%n";
        NumberFormat numberFormat = DecimalFormat.getNumberInstance();
        System.out.format("+-----------+------------+%n");
        System.out.format("| Argument  | Value      |%n");
        System.out.format("+-----------+------------+%n");
        for (int i = argument1; i < argument2; i += step) {
            System.out.format(leftAlignFormat, i, numberFormat.format(tangensFunctionFormat(i)));
        }
        System.out.format("+-----------+------------+%n");
    }
}
