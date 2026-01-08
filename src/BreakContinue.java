import java.util.Scanner;

public class BreakContinue {
    public static void show() {
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < 10; i++) {
            if(i == 5) {
                //break;
                continue;
            }

            System.out.print(i + " ");
        }

        scanner.close();
    }
}