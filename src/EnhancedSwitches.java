import java.util.Scanner;

public class EnhancedSwitches {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("Please enter a day: ");
        day = scanner.nextLine();

        switch(day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("Today is a weekday!");

            case "saturday", "sunday" -> System.out.println("Today is a weekend!");

            default -> System.out.println(day + " is not a day!");
        }

        scanner.close();
    }
}