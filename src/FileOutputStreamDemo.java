import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void show() {
        try {
            FileOutputStream fos = new FileOutputStream("example4.txt");
            String data = "Hello, FileOutputStream!";
            fos.write(data.getBytes()); // convert String to bytes
            fos.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
