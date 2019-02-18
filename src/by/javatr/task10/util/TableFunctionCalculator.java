package by.javatr.task10.util;

import by.javatr.scanner.EnterTheNumber;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TableFunctionCalculator {
    public static double argument1 = EnterTheNumber.enterDouble();
    public static double argument2 = EnterTheNumber.enterDouble();
    public static double step = EnterTheNumber.enterDouble();
    public static void tangensFunctionFormat() {
        String leftAlignFormat = "| %-9s | %-10s |%n";
        NumberFormat numberFormat = DecimalFormat.getNumberInstance();

        System.out.format("+-----------+------------+%n");
        System.out.format("| Argument  | Value      |%n");
        System.out.format("+-----------+------------+%n");

        for (double i = argument1; i <= argument2; i += step) {
            System.out.format(leftAlignFormat, i, numberFormat.format(Math.tan(i)));
        }

        System.out.format("+-----------+------------+%n");
    }
}
