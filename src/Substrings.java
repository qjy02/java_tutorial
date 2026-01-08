import java.util.Scanner;

public class Substrings {
    public static void show() {
        Scanner scanner = new Scanner(System.in);

        String email, username, domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);

        }
        else {
            System.out.println("Email must contain @!");
        }

        scanner.close();
    }
}
