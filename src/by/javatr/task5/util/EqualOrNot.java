package by.javatr.task5.util;

public class EqualOrNot {
    private static int sum = 0;
    /**
     * @param tsnumber
     * @return boolean
     */
    public static boolean equals(int tsnumber) {
        int inputNumber = tsnumber;
        calculateSum(tsnumber);

        return Math.pow(tsnumber, 2) == Math.pow(sum, 3);
    }
    /**
     *
     * @param tsnumber
     */
    private static void calculateSum(int tsnumber) {
        while(tsnumber != 0) {
            //Суммирование цифр числа
            sum += (tsnumber % 10);
            tsnumber /= 10 ;
        }
    }
}
