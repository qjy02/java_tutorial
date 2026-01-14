import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;

        while (alarmTime == null) {
            try {
                System.out.print("Enter alarm time (HH:mm:ss): ");
                String input = scanner.nextLine();
                alarmTime = LocalTime.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:mm:ss");
            }
        }

        System.out.println("Alarm set for " + alarmTime);

        Clock clock = new Clock(alarmTime);
        Thread alarmThread = new Thread(clock);
        alarmThread.start();
    }
}