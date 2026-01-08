import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void show() {
        // ROCK PAPER SCISSORS GAME
        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice, computerChoice;
        String playAgain = "y";

        // GET CHOICE FROM THE USER
        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice!");
                continue;
            }

            // GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // CHECK WIN CONDITIONS
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a draw!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper") ||
                    playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // ASK TO PLAY AGAIN?
            System.out.print("\nPlay again (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();

            System.out.println();

        } while(playAgain.equals("y"));

        // GOODBYE MESSAGE
        System.out.println("Thank you for playing!");

        scanner.close();
    }
}