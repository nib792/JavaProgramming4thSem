
import java.util.Scanner;

public class practiceStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1.java program to convert a string to lower case
        String name = "RabIm";
        System.out.println(name.toLowerCase());
//        2.to replace white spaces with the underscores
        String fname = "Rabin Mishra";
        System.out.println(fname.replace(" ", "_"));
//        3.detect if the number of spaces in a string is double or triple
        String testStr = "Hello World   ! This  is a test    string";
        if(testStr.contains("  ")){
            System.out.println("contains double white spaces");
        }
        else{
            System.out.println("dont contain double spaces");
        }
        if(testStr.contains("   ")){
            System.out.println("contains triple white spaces");
        }
        else{
            System.out.println("doesnt containt triple white space");
        }
//        problem 3
        String letter="Dear <|name|> ,Thanks a lot";
        letter=letter.replace("<|name|>","rabin");
        System.out.println(letter);

    }
}
