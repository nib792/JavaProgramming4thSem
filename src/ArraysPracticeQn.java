import java.util.Scanner;

public class ArraysPracticeQn {
    public static void main(String[] args) {
        System.out.println("Practice questions on array ");
//        qn1
        Scanner sc = new Scanner(System.in);
////        creating an array of 5 floats and calculating their sum
//        float[] arr1 = new float[5];
//        float sum = 0;
//        System.out.println("Enter the values of array");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("Enter the value at" + i + " :");
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("Displayingt the contents of an array");
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//            sum += arr1[i];
//        }
//        System.out.println("The obtained sum is " + sum);
//        float sumf = 0;
//        for (float element : arr1) {
//            sumf += element;
//        }
//        System.out.println("The sum using for each loop is " + sumf);
//        System.out.println("Program to check whether the given integer is present in the array or not");
//        int[] array = new int[5];
//        System.out.println("ask for values");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter the value at position " + i + " :");
//            array[i] = sc.nextInt();
//        }
//        int num;
//        System.out.println("ask the value of integer to be searched");
//        num = sc.nextInt();
//        System.out.println("display the value of array");
//        for (int ele : array) {
//            System.out.println(ele);
//        }
//        boolean isInArray = false;
////        use of for each looop
//        for (int ele : array) {
//            if (num == ele) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("Entered number is in arry");
//        } else {
//            System.out.println("Enterd number is not in array");
//        }


        System.out.println("calculating the average marks of studets in physics");
        int n;
        System.out.println("Enter the number of students in a class");
        n = sc.nextInt();
        float[] marks = new float[n];
        System.out.println("asking for the marks of students in phyiscs");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the value of marks of student of roll:" + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        float sum = 0;
        System.out.println("The obtained value of the marks is: ");
        for (float elem : marks) {
            System.out.println(elem);
            sum += elem;
        }
        System.out.println("The obtained value of sum of marks of all students in physics is" + sum);
        System.out.println("The average value of obtained sum is : " + sum / n);

////         adding two matrices of order 2*3 in java
//        int sum = 0;
//        int[][] matrix = new int[2][3];
//        System.out.println("Asking for the value of 2*3 nmatrix in java");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Enter the value of position" + i + " ," + j + ": ");
//                matrix[i]][j]=sc.nextInt();
//            }
//        }

    }
}

