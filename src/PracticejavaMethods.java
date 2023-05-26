
import java.util.Scanner;

public class PracticejavaMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mulTable(2);
        pattern1();
        sumNatural(10);
        sumNatural(5);
        System.out.println("Recursive java progarm to print the sum of n natural numbers");
        int value = sumRecursive(5);
        System.out.println("The obtained sum is " + value);
        pattern2();
        System.out.println("function printing nth term of fibonacci sequence using recursion");
        int num = 10;
        for (int i = 0; i < num; i++) {
            System.out.print(fibo(num) + " ");
        }
    }

    public static void mulTable(int y) {
        System.out.println("Program in java to print the multiplication table of a number");
        int x = y;
        for (int i = 1; i <= 10; i++) {
            System.out.print(x + " *" + i + "=" + (x * i));
            System.out.println();
        }
    }

    public static void pattern1() {
        System.out.println("Java method to print the desired pattern ");
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void sumNatural(int n) {
        System.out.println("Iterative java progarm to print the sum of n natural numbers");
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The obtained sum is " + sum);

    }

    public static int sumRecursive(int p) {

        if (p > 0) {
            return p + sumRecursive(p - 1);
        } else {
            return 0;
        }
    }

    public static void pattern2() {
        System.out.println("Printing  the desired pattern");
        for (int i = 4; i != 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int fibo(int num) {
//        use the concept of return n-1+
        if (num <= 1) {
            return num;
        } else
            return fibo(num - 1) + fibo(num - 2);
    }

}
