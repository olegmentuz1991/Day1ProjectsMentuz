package by.javatr.task6.Runner;

import by.javatr.scanner.EnterTheNumber;
import by.javatr.task6.util.HoursMinutesSecondsOfTheDay;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд");
        ArrayList<Integer> time = HoursMinutesSecondsOfTheDay.timer(EnterTheNumber.enterInt());
        System.out.println((time.get(0) + " Часов "+ time.get(1) + " минут " + time.get(2) + " секунд"));
    }
}
