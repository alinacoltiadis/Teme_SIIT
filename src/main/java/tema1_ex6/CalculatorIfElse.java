package tema1_ex6;

import java.util.Scanner;

public class CalculatorIfElse {
    public static void main(String[] args) {
        System.out.println("-----This is a calculator------");
        Scanner readVar = new Scanner(System.in);

        //1.reading user input, numbers and operator
        System.out.println("Please input number 1: ");
        int number1 = readVar.nextInt();

        System.out.println("Please input number 2: ");
        int number2 = readVar.nextInt();

        System.out.println("Please input operator:");
        System.out.println("* for multiplication");
        System.out.println("/ for division");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        String operator = readVar.next();

        int result = 0;

        if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
            result = number1 / number2;
        } else if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else {
            System.out.println("Please input a valid operator: ");
        }
        System.out.println("The result of: " +number1+" "+operator+" "+number2+" = "+ result);
    }


}
