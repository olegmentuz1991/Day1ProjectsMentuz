package by.javatr.task9.runner;


import by.javatr.scanner.EnterTheNumber;
import by.javatr.task9.util.CircleParameters;


public class Runner {
    public static void main(String[] args) {

        double radius = EnterTheNumber.enterPositiveDouble();
        System.out.println("Длина окружности: " + CircleParameters.circleLength(radius));
        System.out.println("Площадь окружности: " + CircleParameters.circleSquare(radius));
    }
}
