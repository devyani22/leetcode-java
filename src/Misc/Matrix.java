package Misc;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // prompt the user to enter matrix data
        System.out.println("Enter matrix data: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // print the matrix
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // print the transpose of the matrix
        System.out.println();
        int[][] matrixTranspose = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for(int j = 0; j < rows; j++) {
                matrixTranspose[i][j] = matrix[j][i];
                System.out.print(matrixTranspose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
