package tema1_ex9;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {

        //1.reading array from keyboard
        System.out.println("Please input array length: ");
        Scanner readVar=new Scanner(System.in);
        int arrayLength = readVar.nextInt();

        int[] arrayReadFromKeyboard = new int[arrayLength];
        boolean isequal = false;
        int index2 =1;

        System.out.println("Please input array's elements: ");
        for (int index= 0; index < arrayLength; index++) {
            arrayReadFromKeyboard[index] = readVar.nextInt();
        }

        //2.identifying & printing only uniques elements
        System.out.println("The unique elements array is: ");
        int currentElement = arrayReadFromKeyboard[0];
        for (int index1 = 0; index1 < arrayLength; index1++) {
            if (currentElement == arrayReadFromKeyboard[index1] && !isequal) {
                isequal = true;
            } else if(currentElement != arrayReadFromKeyboard[index1] ) {
                System.out.print(" " +currentElement);
                currentElement = arrayReadFromKeyboard[index1];
                isequal=false;
                index2++;
            }
        }
        System.out.println(" "+currentElement);
        System.out.println("And there are "+index2+" elements in array");
   }
}
