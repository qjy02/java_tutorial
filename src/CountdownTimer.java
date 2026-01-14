import java.time.Year;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class CountdownTimer {
    public static void show() {
        // Countdown Timer Project
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the # of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;
            final int currentYear = Year.now().getValue();

            @Override
            public void run() {
                System.out.println(count);
                count--;

                if(count <= 0) {
                    System.out.printf("HAPPY NEW YEAR %d!", currentYear);
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // (task, delay, period)

        scanner.close();
    }
}
