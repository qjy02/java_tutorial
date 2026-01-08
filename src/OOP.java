import java.util.Scanner;

public class OOP {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        Room room = new Room();
        String choice;

        System.out.printf("Welcome! Do you want to know more about %s (Y/N): ", room.name);
        choice = scanner.nextLine().toUpperCase();

        if(choice.equals("Y")) {
            System.out.println("Name: " + room.name);
            System.out.println("Lot: " + room.lot);
            System.out.println("Year: " + room.year);
            System.out.printf("Price: %s %.2f\n", room.currency, room.price);

            if(room.isOccupied) {
                room.alert(room.isOccupied);
            }
            else {
                //Overloaded Methods
                room.alert();
            }

        }
        else {
            System.out.println("Bye bye, see you again!");
        }

        scanner.close();
    }
}