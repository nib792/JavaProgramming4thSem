
import java.util.Scanner;

public class sumThree {
    public static void main(String[] args) {
        System.out.println("Taking user input and adding 3 number in java");
        Scanner sc = new Scanner(System.in);
        int totalNumbers = 3;
        int[] numbers = new int[totalNumbers];
        for (int i = 0; i < totalNumbers; i++) {
            System.out.println("Enter the value of numbers:" + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }
        int totalSum = 0;
        for (int i = 0; i < totalNumbers; i++) {
            totalSum += numbers[i];
        }
        System.out.println("The sum of threee numbers is" + ": " + totalSum);
        System.out.println("What is your name");
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day");

    }
}
