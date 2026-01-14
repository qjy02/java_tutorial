import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void show() {

        try {
            FileInputStream fis = new FileInputStream("TextFiles/example2.txt");

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
