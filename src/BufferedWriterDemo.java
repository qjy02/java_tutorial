import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void show() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("example2.txt"));
            bw.write("Hello, World!");
            bw.newLine(); // adds a line break
            bw.write("This is faster than FileWriter for many lines.");
            bw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
