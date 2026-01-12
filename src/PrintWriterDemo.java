import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterDemo {
    public static void show() {
        try {
            PrintWriter pw = new PrintWriter("example3.txt");
            pw.println("Hello, PrintWriter!");
            pw.println(12345); // can print numbers directly
            pw.printf("Pi approx: %.2f\n", 3.14159); // formatted output
            pw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}