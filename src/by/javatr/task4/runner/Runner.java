package by.javatr.task4.runner;

import by.javatr.scanner.EnterTheNumber;
import by.javatr.task4.util.OddEven;

public class Runner {
    public static void main(String[] args) {
        System.out.println(OddEven.twoEvenSuccess(EnterTheNumber.enterArray(4)));
    }
}
