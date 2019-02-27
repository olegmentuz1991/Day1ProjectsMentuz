package by.javatr.scanner;

import java.util.Scanner;

public class EnterTheNumber {
    /**
     * @return int
     */
    public static int enterInt() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Введите число!");
        }

        number = scanner.nextInt();

        return number;
    }

    /**
     * @return String
     */
    public static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String string;
        while (!scanner.hasNextLine()) {
            scanner.nextLine();
            System.out.println("Введите строку!");
        }

        string = scanner.nextLine();

        return string;
    }

    /**
     * @return Double
     */
    public static Double enterDouble() {
        Scanner scanner = new Scanner(System.in);
        Double number;

        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("Введите дробное число! ");
        }

        number = scanner.nextDouble();

        return number;
    }
    public static double enterPositiveDouble() {
        double positiveNumber;
        while (true) {
            System.out.println("Введите радиус окружности: ");
            double number = EnterTheNumber.enterDouble();
            if (number < 0) {

            } else {
                positiveNumber = number;
                break;
            }

        }
        return positiveNumber;
    }

    public static int enterMonth() {
        int month;
        while (true) {
            System.out.println("Введите месяц: ");
            int number = enterInt();
            if (number < 1 || number > 12) {

            } else {
                month = number;
                break;
            }
        }
        return month;
    }

    public static int enterYear() {
        int year;
        while (true) {
            System.out.println("Введите год: ");
            int number = enterInt();
            if (number < 0) {

            } else {
                year = number;
                break;
            }
        }
        return year;
    }
    public static int[] enterArray(int length) {
        int[] array = new int[length];
        for (int i =0; i<length; i++){
            array[i] = enterInt();
        }
        return array;
    }
    public static int threeSignsNumber() {
        int number = 0;

        while (true) {
            System.out.println("Введите трёхзначное число: ");
            int tmp = enterInt();
            if (tmp < 100 || tmp > 1000) {

            } else {
                number = tmp;

                return number;
            }
        }
    }
}
