package by.javatr.task5.util;

import by.javatr.task5.scanner.EnterThreeSignsNumber;

public class EqualOrNot {
    private static int sum = 0;

    /**
     * @return boolean
     */
    public static boolean equals() {
        int inputNumber = EnterThreeSignsNumber.threeSignsNumber();
        calculateSum(inputNumber);

        return Math.pow(inputNumber, 2) == Math.pow(sum, 3);
    }

    /**
     * @param inputNumber int
     */
    private static void calculateSum(int inputNumber) {
        while(inputNumber != 0) {
            //Суммирование цифр числа
            sum += (inputNumber % 10);
            inputNumber /= 10 ;
        }
    }
}
