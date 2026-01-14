import java.util.concurrent.ThreadPoolExecutor;

public class Multithreading {
    public static void show() {
        // Multithreading -> Enables a program to run multiple threads concurrently
        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e) {
            System.out.println("Thread was interrupted");
        }

        System.out.println("GAME OVER!");
    }
}
