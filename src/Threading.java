import java.util.Scanner;

public class Threading {
    public static void show() {
        // Threading
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable("Hi");
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 5 seconds to enter your name");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s!\n", name);

        scanner.close();

    }
}
