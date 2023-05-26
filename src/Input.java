
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number 1");
        int a = sc.nextInt();
        float f1 = sc.nextFloat();
        System.out.println("Enter the value of number 2");
        int b = sc.nextInt();
        float f2 = sc.nextFloat();
        int sum = a + b;
        float sumf = f1 + f2;
        System.out.println("The sum of integers is" + sum);
        System.out.println("The sum of floating point number is " + sumf);
//        for checking the validity of user input

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
//        for reading the whole line after the whitespaces we must use next
//        line concept if we only use the concept of nexxt then it will
//        just print use the vary first word of the sentence and ignore all the other
//        upcoming words
        String str1=sc.next();
        System.out.println(str1); //just prints the very first word of user input
        String str2=sc.nextLine();
        System.out.println(str2); //prints the whole block of sentence

    }
}
