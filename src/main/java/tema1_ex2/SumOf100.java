package tema1_ex2;

public class SumOf100 {
    public static void main (String[] args) {

        //1. Calculate the sum of the first 100 numbers higher than 0

        //calculating sum
        int sum = 0;
        for (int index=0; index<=100; index++) {
            sum = sum + index;
        }

        //displaying sum
        System.out.println("Sum of first 100 numbers > 0 is: "+sum);
    }
}
