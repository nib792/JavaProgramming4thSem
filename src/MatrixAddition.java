import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;

        // Create the first matrix
        int[][] matrix1 = new int[rows][columns];
        System.out.println("Enter the elements of the first matrix:");
        populateMatrix(matrix1);

        // Create the second matrix
        int[][] matrix2 = new int[rows][columns];
        System.out.println("Enter the elements of the second matrix:");
        populateMatrix(matrix2);

        // Add the matrices
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Display the sum matrix
        System.out.println("Sum of the matrices:");
        displayMatrix(sumMatrix);
    }

    public static void populateMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter the element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
