package tema1_ex1;

import java.util.Scanner;

public class SmallestFromArray {
    public static void main (String[] args) {

        //2. Display the smallest number from an array of number (2 versions: with normal for and with foreach)

        Scanner readFromKeyboard = new Scanner(System.in);
        System.out.print("Input array desired length:");
        int arrayLength = readFromKeyboard.nextInt();

        int[] array = new int [arrayLength];
        System.out.print("Input array elements: ");
        for (int index=0; index<arrayLength; index++) {
            array[index] = readFromKeyboard.nextInt();
        }

        System.out.println("Your array is: ");
        for (int index=0; index<arrayLength; index++) {
            System.out.print(" " +array[index]);
        }
        System.out.println();

        //finding min using regular for

        int min = array[0];
        for (int index = 1; index<arrayLength; index++) {
            if (array[index]<min) {
                min = array[index];
            }
        }

        //finding min using foreach
        //int min = extractMinFromArray(array);
        System.out.println("Minimum element from array is: " + min);
    }

    public static int extractMinFromArray (int[] arrayOfNumbers) {
        int min = arrayOfNumbers[0];
        for (int index : arrayOfNumbers) {
            if (index < min) {
                min = index;
            }
        }
        return min;
    }




}


