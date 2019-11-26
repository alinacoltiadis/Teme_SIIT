package tema1_ex8;

import java.util.Scanner;

public class FactorialN {
    public static void main (String[] args) {
        System.out.println("Please input n: ");
        Scanner readVar = new Scanner(System.in);

        int n = readVar.nextInt();
        int product = 1;

        for (int i = 1; i <= n; i++) {
            product = product * i;
        }

        System.out.println("N Factorial este: " + product);
    }

}
