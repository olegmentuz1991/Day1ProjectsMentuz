package by.javatr.task4.util;

import by.javatr.scanner.EnterTheNumber;

public class OddEven {

    public static boolean twoEvenSuccess(){
        int count=0;
for (int i = 0;i<4;i++){
    if (EnterTheNumber.enterInt()%2==0){
        count++;
    }
}
        if (count>=2){
            return true;
        }
return false;
    }
}
