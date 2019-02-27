package by.javatr.task4.util;


public class OddEven {
    /**
     * @return boolean
     */
    public static boolean twoEvenSuccess(int [] arguments) {
        int count=0;
for (int i = 0;i<4;i++){
    if (arguments[i]%2==0) {
        count++;
    }
}
        if (count>=2) {
            return true;
        }
return false;
    }
}
