import java.util.Scanner;

public class multiDimensional {
    public static void main(String[] args) {
        System.out.println("Multidimensional arrays in java");
        Scanner sc = new Scanner(System.in);
        int[][] flats; //a 2-d array declaration
        flats = new int[2][3];
//        taking the inputs usng for loop
        System.out.println("Asking for the value of an array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the value of array at " + i + "," + j);
                flats[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying the values of an array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("displaying using different technique");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("creating a 3d string array in java");
        System.out.println("Enter the values of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the values of col1 ");
        int col1 = sc.nextInt();
        System.out.println("Enter the values of col2");
        int col2 = sc.nextInt();

        int[][][] array = new int[rows][col1][col2];
//        taking input for each element in string array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col1; j++) {
                for (int k = 0; k < col2; k++) {
                    System.out.println("Enter the value at position" + i + ", " + j + "," + k+" :");
                    array[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("displaying the 3d array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col1; j++) {
                for (int k = 0; k < col2; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
