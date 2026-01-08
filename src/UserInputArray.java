import java.util.Scanner;

public class UserInputArray {
    public static void show() {
        Scanner scanner = new Scanner(System.in);

        // Array with size 4
        String[] foods;
        int size;

        System.out.print("How many foods  do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        // Ask the user for the rest of the foods
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        // Print all foods
        System.out.println("\nYour foods:");
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}