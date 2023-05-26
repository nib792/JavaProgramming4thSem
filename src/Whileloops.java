import java.util.Scanner;

public class Whileloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        types of loop while,do while and for
//        while loops keeps executig if the condition is not satisfied
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
//        program to print natural numbers from 100 to 200
        int num = 100;
        while (num <= 200) {
            System.out.println(num);
            num++;
        }
//        use of boolean whether true or false is only acceptable in java we cant use 1 or 0 like we
//        use in c or C++

//        dowhile loops in java
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b < 5);
//program to print first n natural numbers using do while loop
        System.out.println("Enter the number to which you want to have the first n natural numbers");
        int number = sc.nextInt();
        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c <= number);
//        for loops in java
//        program to print first n odd numbers using a for loop
        System.out.println("Program printing first n odd numbers using for loops");

        int n = sc.nextInt();
        int count = 0;
        for (int j = 1; count < n; j += 2) {
            System.out.println(j);
            count++;
        }
        for (int k = 1; k <= n; k++) {
            System.out.println(2 * k + 1);
        }
//        program to print first n natural numbers in reverse order
        System.out.println("Enter the value of the number");
        int value = sc.nextInt();
        for (int l = 7; l != 0; l--) {
            System.out.println(l);
        }

    }
}
