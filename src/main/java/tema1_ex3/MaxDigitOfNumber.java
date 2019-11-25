package tema1_ex3;

import java.util.Scanner;

public class MaxDigitOfNumber {
    public static void main (String[] args) {
        System.out.println("Please input number: ");
        Scanner readVar = new Scanner(System.in);
        int readNumberFromKeyboard = readVar.nextInt();

        int[] arrayNumber = new int[100];
        int index = 0;

        while (readNumberFromKeyboard>0) {
            int lastDigit = readNumberFromKeyboard % 10;
            arrayNumber[index]=lastDigit;
            readNumberFromKeyboard = readNumberFromKeyboard / 10;
            index++;
        }

        int max = arrayNumber[0];
        for (int index1: arrayNumber){
            if (index1 > max){
                max = index1;
            }
        }

        System.out.println("Max digit of your number is: " + max);
     }
}
