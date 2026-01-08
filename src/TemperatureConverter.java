import java.util.Scanner;

public class TemperatureConverter {
    public static void show() {
        Scanner scanner = new Scanner(System.in);

        double temp, newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit (°C or °F)?: ");
        unit = scanner.next().toUpperCase();

        // (condition) ? true : false
        newTemp = (unit.equals("C") ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32);

        System.out.printf("Temperature: %.1f °%s", newTemp, unit);

        scanner.close();
    }
}