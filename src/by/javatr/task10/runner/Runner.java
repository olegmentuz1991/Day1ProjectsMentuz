package by.javatr.task10.runner;

import by.javatr.scanner.EnterTheNumber;
import by.javatr.task10.util.TableFunctionCalculator;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите первый аргумент:");
        int arg1 = EnterTheNumber.enterInt();
        System.out.println("Введите второй аргумент:");
        int arg2 = EnterTheNumber.enterInt();
        System.out.println("Введите шаг:");
        int step = EnterTheNumber.enterInt();
       TableFunctionCalculator.tangensFormater(arg1,arg2,step);
    }
}
