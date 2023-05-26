import java.util.Scanner;

public class KmsToMilesConverter {
    public static void main(String[] args) {
        System.out.println("Kilometers to miles Converter in Java");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance covered in Kilometers");
        double kilometers=sc.nextDouble();
//        now converting to miles
        double miles=kilometers*(0.62137119);
        System.out.println(kilometers+" kilometers is eual to "+miles+ " miles");
    }
}
