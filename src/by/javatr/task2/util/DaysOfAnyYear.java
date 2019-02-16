package by.javatr.task2.util;

import by.javatr.scanner.EnterTheNumber;


public class DaysOfAnyYear {
    private final  static int MONTH_1 = 28;
    private final static int MONTH_2 = 29;
    private final static int MONTH_3 = 30;
    private final static int MONTH_4 = 31;
    private static int month;
    private static int year;
    public static int daysOfAnyYear(){
        while (true) {
            System.out.println("Введите месяц: ");
            int number = EnterTheNumber.enterInt();
            if (number < 1 || number > 12) {

            } else {
                month = number;
                break;
            }
        }
        while (true) {
            System.out.println("Введите год: ");
            int number = EnterTheNumber.enterInt();

            if (number < 0) {

            } else {
                year = number;
                break;

            }
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return MONTH_4;
            case 4:
            case 6:
            case 9:
            case 11:
                return MONTH_3;
            case 2:
            if (year % 100 == 0 && year % 400 == 0)
                return MONTH_2;

            else if (year % 4 == 0 && year % 100 > 0)
                return MONTH_2;

            else if (year % 100 == 0)
                return MONTH_1;

            else
                return MONTH_1;
            default:
                return 0;

        }

    }

}

