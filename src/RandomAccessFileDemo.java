import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void show() {

        try {
            String filePath = "Textfiles/example3.txt";

            RandomAccessFile raf =
                    new RandomAccessFile(filePath, "r");

            raf.seek(4); // move cursor to byte position 5

            System.out.println(raf.readLine());

            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}