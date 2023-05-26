import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 2) {
                System.out.println("Lets break the statement");
                break;
            }
        }
        for(int j=0;j<5;j++){
            if(j==2){
                System.out.println("Use of continue as it skips the process for the value 2");
                continue;
            }
            System.out.println(j);
        }
    }
}

