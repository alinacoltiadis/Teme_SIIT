package tema1_ex5;

import java.util.Scanner;

public class PrimeNumbersLowerThanN {
    public static void main(String[] args) {

        //1.reading the number from keyboard
        System.out.println("Please input the number up to which you would like to display all prime numbers: ");
        Scanner readVar = new Scanner(System.in);
        int numberReadFromKeyboard = readVar.nextInt();

        //2.testing if numbers are prime and displaying them
        System.out.println("The prime numbers lower than " +numberReadFromKeyboard+ " are: ");
        for (int index = 0; index < numberReadFromKeyboard; index++) {
            if (index % 2 != 0) {
                System.out.print(index + " ");
            }
        }
    }
}
