import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void show() {
        // NUMBER GUESSING GAME
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess, attempts = 0, min = 1, max = 100;
        int randomNumber = random.nextInt(min, max + 1); // Between 1 & 100

        System.out.println("Number Guessing Game");
        System.out.printf("Guess the number between %d and %d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < min || guess > max ) {
                System.out.printf("Please enter a number in range between %d and %d\n", min, max);
            }
            else if (guess < randomNumber) {
                System.out.println("Too LOW! Try again");
            }
            else if (guess > randomNumber) {
                System.out.println("Too HIGH! Try again");
            }
            else {
                System.out.println("CORRECT ! The number was " + randomNumber);
                System.out.println("Attempts taken: " + attempts);
            }

        } while (guess != randomNumber);

        scanner.close();
    }
}