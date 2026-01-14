import java.util.Scanner;

public class Enums {
    public static void show() {
        // Enumerations => A special kind of class that represents a fixed set of constants
        Scanner scanner = new Scanner(System.in);
        //Day today = Day.TUESDAY;

        //System.out.println(today);                 // TUESDAY
        //System.out.println(today.getDayNumber());  // 3

        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> System.out.println("It is a weekday");

                case SATURDAY, SUNDAY -> System.out.println("It is a weekend");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Please enter a valid day option!");
        }

        scanner.close();
    }
}
