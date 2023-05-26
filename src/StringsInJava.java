import java.util.Scanner;

public class StringsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        In java string by itself is also a class
        String name = new String("Rabin");
        System.out.println(name);
        String myName = "rabin";
        System.out.println(myName);
//        methods of string in java
//        length of string
        String angel = "DAKOTA";
//        .length() returs the length of the string
        int value = angel.length();
        System.out.println(value);
//        .toLowerCase() wil return the value in lowercase
        String lstring = angel.toLowerCase();
//       .toLowerCase() wil return the value in uowercase
        String ustring = angel.toUpperCase();
        System.out.println(lstring);
        System.out.println(ustring);
//        .trim() will remove all the leading and trailing whitespaces
        String nonTrimedString = "           rabin";
        System.out.println(nonTrimedString);
        String trimmedString = nonTrimedString.trim();
        System.out.println(trimmedString);

//        .substring() returns a new string that starts from index number desired
//        and move upto the last of the string
// the value of substring argument written 0 is conidered to be redundant
        System.out.println(angel.substring(2));
        System.out.println(angel.substring(2, 5));
//        .replace() contains two arguments as old and new character and will be replaced
// basically will replace the old character with the desired chracter
        System.out.println(angel.replace("D", "B"));

//        .startsWith() will check if the word or string starts with the particular set of the characteres
//        .endsWith() will check if the word or string ends with the particular set of characters
//        .charAt() returns whether at the desired index the character is available or not
        System.out.println(angel.startsWith("DA"));
        System.out.println(angel.endsWith("DA"));
        System.out.println(angel.charAt(2));
        System.out.println(angel.indexOf("DA",1));
        System.out.println(angel.equals("DAKOTA"));

    }
}
