import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void show() {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello World!");
            writer.close(); // always close the writer
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
