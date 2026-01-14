import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateandTimes {
    public static void show() {
        // Date
        //LocalDate date = LocalDate.now();
        //System.out.println(date);

        // Time
        //LocalTime time = LocalTime.now();
        //System.out.println(time);

        // Datetime
        //LocalDateTime datetime = LocalDateTime.now();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        //String newDateTime = datetime.format(formatter);
        //System.out.println(newDateTime);

        // Instant
        //Instant instant = Instant.now();
        //System.out.println(instant);

        // Custom Date, Datetime
        //LocalDate birthDate = LocalDate.of(2025, 3, 2);
        //System.out.println(birthDate);

        //LocalDateTime birthDatetime = LocalDateTime.of(2025, 3, 2, 9, 48, 0);
        //String formattedBirthDatetime = birthDatetime.format(formatter);
        //System.out.println(formattedBirthDatetime);

        // If Equal/After/Before
        LocalDate date1 = LocalDate.of(2026, 1, 1);
        LocalDate date2 = LocalDate.of(2026, 1, 12);

        if(date1.isEqual(date2)) {
            System.out.println(date1 + " is equals to " + date2);
        }
        else if(date1.isAfter(date2)) {
            System.out.println(date1 + " is later to " + date2);
        }
        else if(date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        }

    }
}
