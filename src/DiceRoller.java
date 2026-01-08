import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void show() {
        //ROLLER DICE PROGRAM
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numofDice, total = 0;

        System.out.print("Enter the # of dice to roll: ");
        numofDice = scanner.nextInt();

        if(numofDice > 0) {
            // ROLL ALL THE DICE
            for(int i = 0; i < numofDice; i++) {
                int roll = random.nextInt(1, 7);
                System.out.println("You rolled: " + roll);
                printDice(roll);
                // GET THE TOTAL
                total += roll;
            }

            System.out.println("Total: " + total);
        }
        else {
            System.out.println("# of dice must be greater than 0");
        }

        scanner.close();
    }

    // DISPLAY ASCII OF DICE
    static void printDice(int roll) {

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll!");
        }
    }
}