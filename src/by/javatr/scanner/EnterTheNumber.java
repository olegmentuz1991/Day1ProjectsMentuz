package by.javatr.scanner;

import java.util.Scanner;

public class EnterTheNumber {
    /**
     * @return int
     */
    public static int enterInt() {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (!scanner.hasNextInt()){
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
}
