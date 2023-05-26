import java.util.Scanner;

public class Inputdetector {
    public static void main(String[] args) {
        System.out.println("User input detector in java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character ");
        String str = sc.next();
        System.out.println(str);
        System.out.println("Enter a string");
        String str2 = sc.nextLine();
        System.out.println(str2);

        System.out.println("Enter a integer number");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

    }
}
