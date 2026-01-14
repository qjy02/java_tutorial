import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {

    public static void show() {
        // Word to guess
        String word = "pizza";
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        ArrayList<Character> guessedLetters = new ArrayList<>();
        int wrongGuesses = 0;
        int maxWrong = 6;

        // Initialize wordState with underscores
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("*****************************");
        System.out.println("Welcome to Java Hangman Game!");
        System.out.println("*****************************");

        // Main game loop
        while (wrongGuesses < maxWrong) {
            // Print hangman art
            System.out.println(getHangmanArt(wrongGuesses));

            // Print current word state
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println("\nGuessed letters: " + guessedLetters);

            // Prompt user
            System.out.print("Enter a letter: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Please enter a single letter.\n");
                continue;
            }

            char guess = input.charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed that letter!\n");
                continue;
            }

            guessedLetters.add(guess);

            if (word.indexOf(guess) >= 0) {
                // Correct guess
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                System.out.println("Good guess!\n");
            } else {
                // Wrong guess
                wrongGuesses++;
                System.out.println("Wrong guess!\n");
            }

            // Check win condition
            if (!wordState.contains('_')) {
                System.out.println("Congratulations! You guessed the word: " + word);
                System.out.println(getHangmanArt(wrongGuesses));
                scanner.close();
                return;
            }
        }

        // Player lost
        System.out.println(getHangmanArt(wrongGuesses));
        System.out.println("Game over! The word was: " + word);
        scanner.close();
    }

    // ASCII art for hangman
    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> "";
            case 1 -> """
                    
                    
                    
                    
                    |
                    |
                    """;
            case 2 -> """
                    
                    |
                    |
                    |
                    |
                    |
                    """;
            case 3 -> """
                    _______
                    |
                    |
                    |
                    |
                    |
                    """;
            case 4 -> """
                    _______
                    |     |
                    |
                    |
                    |
                    |
                    """;
            case 5 -> """
                    _______
                    |     |
                    |     O
                    |
                    |
                    |
                    """;
            case 6 -> """
                    _______
                    |     |
                    |     O
                    |    /|\\
                    |    / \\
                    |
                    """;
            default -> "";
        };
    }
}