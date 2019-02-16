package by.javatr.task5.scanner;

import by.javatr.scanner.EnterTheNumber;

public class EnterThreeSignsNumber {
    private static int number = 0;

    public static int threeSignsNumber() {
        number = 0;

        while (true) {
            System.out.println("Введите трёхзначное число: ");
            int tmp = EnterTheNumber.enterInt();
            if (tmp < 100 || tmp > 1000) {

            } else {
                number = tmp;

                return number;
            }
        }
    }
}
