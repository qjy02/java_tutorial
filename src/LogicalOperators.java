import java.util.Scanner;

public class LogicalOperators {
    public static void show() {
        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);
        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        // Username must be between 4-12 characters and not contain spaces or underscores
        if(username.length() < 4 || username.length() > 12) {
            System.out.println("The username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")) {
            System.out.println("The username cannot contain spaces or underscores");
        }
        else {
            System.out.println("Hello " + username + "!");
        }

        scanner.close();

    }
}
