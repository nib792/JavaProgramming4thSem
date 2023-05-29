import java.util.Random;
import java.util.Scanner;

 class GuessingNumbers {
    private int random_number;
    private int user_input;
    private int noOfGuesses;

    public GuessingNumbers() {
        Random random = new Random();
        random_number = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        user_input = 0;
        noOfGuesses = 0;
    }

    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        user_input = scanner.nextInt();
        noOfGuesses++;
    }

    public boolean isCorrectNumber() {
        if (user_input == random_number) {
            System.out.println("Congratulations! You guessed the correct number.");
            return true;
        } else if (user_input < random_number) {
            System.out.println("Too low. Try again.");
            return false;
        } else {
            System.out.println("Too high. Try again.");
            return false;
        }
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

}

public class GuessNum {
    public static void main(String[] args) {
        GuessingNumbers game = new GuessingNumbers();
        boolean isCorrect = false;
        while (!isCorrect) {
            game.takeUserInput();
            isCorrect = game.isCorrectNumber();
        }
        System.out.println("Total number of guesses: " + game.getNoOfGuesses());

    }
}
