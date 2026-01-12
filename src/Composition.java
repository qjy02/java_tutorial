import java.util.Scanner;

public class Composition {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        Radio radio = new Radio();

        System.out.print("Switch radio to power on mode? (Y/N): ");
        choice = scanner.nextLine().toUpperCase();

        if(choice.equals("Y")) {
            radio.powerOn();

            System.out.print("Switch radio to power off mode? (Y/N): ");
            choice = scanner.nextLine().toUpperCase();

            if(choice.equals("Y")) {
               radio.powerOn();
            }
            else {
                radio.powerOff();
            }
        }
        else {
            radio.powerOff();
        }

        scanner.close();
    }
}
