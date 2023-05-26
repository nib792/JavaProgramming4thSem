
import java.util.Scanner;


public class MarksCalculator {
    public static void main(String[] args) {
        System.out.println("Percentage calculator for the marks of students");
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking the input of 5 different subjects from the students");
        int totalSubjects = 5;
        int[] marks = new int[totalSubjects];
        for (int i = 0; i < totalSubjects; i++) {
            System.out.println("Enter the marks for subject" + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        int totalMarksObtained=0;
        for(int i=0;i<totalSubjects;i++){
            totalMarksObtained +=marks[i];
        }
        double percentage=(totalMarksObtained/(double)(totalSubjects*100))*100;
        System.out.println("Total marks obrtained:"+totalMarksObtained);
        System.out.println("Percentage:"+percentage+"%");

    }
}
