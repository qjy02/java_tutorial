import java.util.Scanner;
import java.time.Year;

public class ForLoop {
    public static void show() {
        // Countdown
        Scanner scanner = new Scanner(System.in);
        int start;
        int currentYear = Year.now().getValue();

        System.out.print("How many seconds to countdown to?: ");
        start = scanner.nextInt();

        for(int i = start; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); //1000 milliseconds = 1 second
            } catch (InterruptedException e) {
                e.printStackTrace(); // prints error if interrupted
            }
        }

        System.out.println("HAPPY NEW YEAR " + currentYear + "!");

        scanner.close();
    }
}