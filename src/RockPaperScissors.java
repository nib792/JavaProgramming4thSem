import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.print("Enter your move (rock, paper, or scissors): ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                int computerMove = random.nextInt(3); // 0 - rock, 1 - paper, 2 - scissors

                String[] moves = {"rock", "paper", "scissors"};
                String computerMoveString = moves[computerMove];

                System.out.println("Computer's move: " + computerMoveString);

                if (playerMove.equals(computerMoveString)) {
                    System.out.println("It's a tie!");
                } else if ((playerMove.equals("rock") && computerMoveString.equals("scissors"))
                        || (playerMove.equals("paper") && computerMoveString.equals("rock"))
                        || (playerMove.equals("scissors") && computerMoveString.equals("paper"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }

                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = scanner.nextLine().toLowerCase();

                if (!playAgain.equals("yes")) {
                    break;
                }
            } else {
                System.out.println("Invalid move. Please enter 'rock', 'paper', or 'scissors'.");
            }
        }

        System.out.println("Thank you for playing!");
    }
}
