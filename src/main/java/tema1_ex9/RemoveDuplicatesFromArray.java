package tema1_ex9;

import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {

        //1.reading array from keyboard
        System.out.println("Please input array length: ");
        Scanner readVar=new Scanner(System.in);
        int arrayLength = readVar.nextInt();

        int[] arrayReadFromKeyboard = new int[arrayLength];
        int[] newArray = new int[];
        int i=0;

        for (int index= 0; index < arrayLength; index++) {
            arrayReadFromKeyboard[index] = readVar.nextInt();
        }

        //2.identifying & removing duplicates
        for (int index1=0; index1 < arrayLength; index1++) {
            for (int index2=index1+1; index2 < arrayLength; index2++) {
                if (arrayReadFromKeyboard[index1] == arrayReadFromKeyboard[index2]) {
                    newArray[i] = arrayReadFromKeyboard[index1];
                    i++;
                }

            }
        }


    }


}
