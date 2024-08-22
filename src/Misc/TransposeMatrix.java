package Misc;

public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;
        // in a transpose, rows become columns and vice versa
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for(int j = 0; j< rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return  transpose;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        int[][] transpose = TransposeMatrix.transpose(matrix);
        int rows = transpose.length;
        int columns = transpose[0].length;

        // print the transpose array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j< columns; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
