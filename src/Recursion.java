import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sum(10);
        System.out.println("The value of sum is" + b);
        int c = sumM(5, 10);
        System.out.println("The obtained value of sum is" + c);
    }

    //    recursively adding numbers from 1 to 10 using the proper halting cndition
    public static int sum(int a) {
        if (a > 0) {
            return a + sum(a - 1);
        } else {
            return 0;
        }
    }

    public static int sumM(int a, int b) {
        if (b > a) {
            return b + sumM(a, b - 1);
        } else {
            return b;
        }
    }
}
