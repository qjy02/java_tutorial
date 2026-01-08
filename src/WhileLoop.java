import java.util.Scanner;

public class WhileLoop {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        } while(number < 1 || number > 10);

        System.out.println("You picked a number " + number);

        scanner.close();
    }
}
