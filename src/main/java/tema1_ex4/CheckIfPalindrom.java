package tema1_ex4;

import java.util.Scanner;

public class CheckIfPalindrom {
    public static void main (String[] args) {

        //1.reading number from keyboard
        System.out.println("Please input number: ");
        Scanner readVar = new Scanner(System.in);
        int numberReadFromKeyboard = readVar.nextInt();

        //2.reading number's length
        int numberLength = 0;
        int temporaryNumber = numberReadFromKeyboard;
        while (temporaryNumber > 0) {
            numberLength++;
            temporaryNumber = temporaryNumber / 10;
        }
        System.out.println("Number lenght is: " + numberLength);

        //3.moving number in an array
        System.out.println("Number in array is: ");
        System.out.println();
        int[] arrayNumber = new int[numberLength];

        for (int index = numberLength-1; index > 0; index--) {
            while (numberReadFromKeyboard > 0) {
                int lastDigit = numberReadFromKeyboard % 10;
                numberReadFromKeyboard = numberReadFromKeyboard / 10;
                arrayNumber[index] = lastDigit;
                System.out.print(arrayNumber[index]);
            }
        }

        System.out.println();
        //4.testing number if palindrome
        int checkIfPalindrome = 0;
        int checkIfPalindrome1 = 0;
        if (numberLength % 2 == 0) {
            for (int index = 0; index <numberLength/2; index++) {
                if (arrayNumber[index] == arrayNumber[numberLength-1-index]) {
                    checkIfPalindrome = checkIfPalindrome +0;
                } else {
                    checkIfPalindrome = checkIfPalindrome +1;
                }
            }
            if (checkIfPalindrome == 0) {
                System.out.println("The number is a palindrome!");
            }  else {
                System.out.println("The number is not a palindrome!");
            }

        } else {
            for (int index = 0; index <numberLength/2-1; index++) {
                if (arrayNumber[index] == arrayNumber[numberLength-1-index]) {
                    checkIfPalindrome1 = checkIfPalindrome1 +0;
                } else {
                    checkIfPalindrome1 = checkIfPalindrome1 +1;
                }
            }
            if (checkIfPalindrome1 == 0) {
                System.out.println("The number is a palindrome!");
            }  else {
                System.out.println("The number is not a palindrome!");
            }

        }
        }
    }

