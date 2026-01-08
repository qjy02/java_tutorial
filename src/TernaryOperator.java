import java.util.Scanner;

public class TernaryOperator {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        String result = (age >= 18) ? "Adult" : "Child";
        System.out.println(result);

        scanner.close();
    }
}
