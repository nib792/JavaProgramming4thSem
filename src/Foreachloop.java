
import java.util.Scanner;

public class Foreachloop {
    public static void main(String[] args) {
        System.out.println("Introduction to for each loop in java");
        Scanner sc = new Scanner(System.in);
//        use .length to get the length of array
        int[] marks = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Printing using a for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing the elments of an array in reverse order");
//        since the array moves from index at 0 to n-1 so the use of concept of marks.length-1 is used
        for (int i = marks.length - 1; i != 0; i--) {
            System.out.println(marks[i]);
        }
        System.out.println("for each loop in java");
//        if the elements is only needed use the for each loop concept
        for (int element : marks) {
            System.out.println(element);
        }


    }
}
