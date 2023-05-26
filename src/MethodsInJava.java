import java.util.Scanner;
//generate a method so that two numbers are compared and if num1>num2 addit else do the subtraction


public class MethodsInJava {
    //overloading of methods in java
    static int maths(int x, int y) {
        return x + y;
    }

    static double maths(double x, double y) {
        return x + y;
    }

    static void ageChecker(int age) {
        if (age > 16) {
            System.out.println("Eligible for citizenship");
        } else {
            System.out.println("Not eligible for citizenship");
        }
    }

    public static int arithmetic(int num1, int num2) {
        int z;
        if (num1 > num2) {
            z = num1 + num2;
            System.out.println("The obtained value of z is" + z);
        } else {
            z = num2 - num1;
            System.out.println("The obtained value of z is" + z);

        }
        return z;
    }

    static void myMethod() {
        System.out.println("This is an example of a method");
    }

    public void myMeth2() {
        System.out.println("THis is a method statement which is non static so need an object for its invocation");
    }

    public static void main(String[] args) {
        MethodsInJava obj = new MethodsInJava();
        obj.myMeth2();
        Scanner sc = new Scanner(System.in);
        myMethod();
        int c = arithmetic(10, 5);
        arithmetic(4, 5);
        ageChecker(24);
        System.out.println("Example of function or method overloading in java");
        int num1 = maths(12, 3);
        double num2 = maths(3.3, 4.9);
        System.out.println("int =" + num1);
        System.out.println("double=" + num2);

    }
}
