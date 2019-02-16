package by.javatr.task7.runner;

import by.javatr.scanner.EnterTheNumber;
import by.javatr.task7.util.PointsDistance;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите координату x1: ");
        int x1 = EnterTheNumber.enterInt();
        System.out.println("Введите координату x2: ");
        int x2 = EnterTheNumber.enterInt();
        System.out.println("Введите координату y1: ");
        int y1 = EnterTheNumber.enterInt();
        System.out.println("Введите координату y2: ");
        int y2 = EnterTheNumber.enterInt();
        System.out.println(PointsDistance.pointDistance(x1, x2, y1, y2));
    }
}
