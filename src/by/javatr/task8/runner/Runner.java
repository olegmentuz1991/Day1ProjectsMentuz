package by.javatr.task8.runner;

import by.javatr.scanner.EnterTheNumber;
import by.javatr.task8.util.FunctionCalculator;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите аргумент: ");
        System.out.println(FunctionCalculator.functionCalculate(EnterTheNumber.enterInt()));
    }
}
