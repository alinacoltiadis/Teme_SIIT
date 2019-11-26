package tema1_ex7;

import java.util.Scanner;

public class MultipleTriesCalculator {
    public static void main(String[] args) {
        System.out.println("-----This is a calculator------");
        Scanner readVar = new Scanner(System.in);

        //1.reading user input, numbers and operator
        while (true) {
            System.out.println("Would you like to run the calculator? Y/N");
            String answer = readVar.next();
            if (answer.equals("Y")) {
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
                System.out.println("The result of: " + number1 + " " + operator + " " + number2 + " = " + Calculator(number1, number2, operator));
            } else {
                System.out.println("Bye-Bye!");
                break;
            }
        }
    }


    public static int Calculator (int number1, int number2, String operator) {

        int result = 0;

        switch (operator) {
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            default:
                System.out.println("Input a valid operator: ");
        }
        return result;

    }

}
