import java.util.Scanner;

public class PracticeLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        printing a star pattern in java
        for (int i = 4; i != 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        practice 2:Write a program to sum first n even numbers using while loop
//        int num;
//        System.out.println("Enter the value of number");
//        num = sc.nextInt();
//        int i = 0;
//        int sum = 0;
//        while (i < num) {
//            System.out.println(2 * i);
//            i++;
//            sum = sum + (2 * i);
//
//        System.out.println("The obtained value of sum is" + sum);
//        program to print multiplication table of n numbers
        System.out.println("Enter the number whose multiplication table you want");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(n + "*" + i + "=" + n * i);
            System.out.print("\n");
        }
//        program to find the factorial of given number using for loop
        System.out.println("Enter the value of number you want the factoral of:");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 0; i < num; i++) {
            fact += fact * i;
        }
        System.out.println("The factorial obtained is " + fact);
    }


}


