package by.javatr.task2.runner;


import by.javatr.scanner.EnterTheNumber;
import by.javatr.task2.util.DaysOfAnyYear;

public class Runner {
    public static void main(String[] args) {
        System.out.println(DaysOfAnyYear.daysOfAnyYear(EnterTheNumber.enterMonth(),EnterTheNumber.enterYear()));
    }
}
