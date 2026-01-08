import java.util.Scanner;

public class WeightConversion {
    public static void show() {
        // WEIGHT CONVERSION PROGRAM
        Scanner scanner = new Scanner(System.in);
        double weight, newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("Option 1: Convert lbs to kgs");
        System.out.println("Option 2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("\nEnter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.43592;

            System.out.printf("The new weight: %.2f kgs", newWeight);
        }
        else if(choice == 2) {
            System.out.print("\nEnter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;

            System.out.printf("The new weight: %.2f lbs", newWeight);
        }
        else {
            System.out.println("Please enter a valid choice!");
        }

        scanner.close();
    }
}