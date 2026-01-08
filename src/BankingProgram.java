import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in); //CLASS

    public static void show() {
        // BANKING PROGRAM
        double balance = 10.99;
        boolean isActive = true;
        int choice;

        while(isActive) {
            // DISPLAY MENU
            System.out.println("\n****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            // GET AND PROCESS USERS CHOICE
            do {
                System.out.print("Enter your choice (1-4): ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> showBalance(balance);
                    case 2 -> balance += deposit();
                    case 3 -> balance -= withdraw(balance);
                    case 4 -> isActive = false;
                    default -> {
                        System.out.println("Invalid choice!");
                    }
                }
            } while(choice < 1 || choice > 4);
        }

        System.out.println("****************************");
        System.out.println("Thank you, have a nice day!");
        System.out.println("****************************");
    }

    static void showBalance(double balance) {
        System.out.printf("Balance: $%.2f\n", balance);
    }

    static double deposit() {
        double amount = 0;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount = 0;

        System.out.print("Enter an amount to be withdrawed: ");
        amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("Insufficient funds!");
            return 0;
        }
        else if(amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
}