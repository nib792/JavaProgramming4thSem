
import java.util.Scanner;

public class chapterTwoPractticeaSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        the questions are taken from the playlist of code with harry
        /*YOutube video from the java tutorial playlists

         *and is at video number 12
         * */
        float a = 7 / 4 * 9 / 2;
        System.out.println("The required answer is " + a);
//        decrypting and encrypting
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);
//        decrypting the grade
        grade = (char) (grade - 8);
        System.out.println(grade);

//        qn3.use of the comparison operator to find if the
//        user input is greater than the specified number
        double num1 = 32;
        System.out.println("Enter the value of num");
        double numInput=sc.nextDouble();
        if(num1>numInput){
            System.out.println("Entered number is less than assigned value");
        }else{
            System.out.println("Entered number is greater than assigned value");
        }
        int v=10; int u=2; int b=3; int s=4;
        float result=(v*v-u*u)/(2*a*s);
        System.out.println("The obtained result is "+result);




    }
}
