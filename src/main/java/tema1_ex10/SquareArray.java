package tema1_ex10;

import java.util.Scanner;

public class SquareArray {

    public static void main (String[] args) {
        Scanner readVar = new Scanner(System.in);

        System.out.println("Please input number of rows of matrix: ");
        int i = readVar.nextInt();
        System.out.println("Please input number of columns of matrix: ");
        int j = readVar.nextInt();

        int[][] matrix = new int[i][j];

        boolean check = isSquare(matrix);
        if (check==true) {
            System.out.println("The matrix IS square!");
        } else {
            System.out.println("Matrix NOT square!");
        }
    }

    public static boolean isSquare(int[][] matrix) {
        boolean isSquare = true;
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++ ) {
                if(matrix.length != matrix[i].length)
                    isSquare = false;
            }
        }
        return isSquare;
    }
}
