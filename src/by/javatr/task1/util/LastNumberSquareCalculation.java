package by.javatr.task1.util;

import by.javatr.scanner.EnterTheNumber;

public class LastNumberSquareCalculation{
    /**
     * @return int
     */
    public static int caseNumbers() {
       int number = EnterTheNumber.enterInt();
           switch (number % 10) {
               case 1:
               case 9:
                   return 1;
               case 2:
               case 8:
                   return 2;
               case 3:
               case 7:
                   return 9;
               case 4:
               case 6:
                   return 6;
               case 5:
                   return 5;
                  default: return 0;
           }
    }
}