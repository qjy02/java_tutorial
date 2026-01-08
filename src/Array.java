import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void show() {
        String[] fruits = {"Apple", "Banana", "Honeydew", "Cherry"};
        int[] numbers = {1, 2, 3};
        double[] prices = { 6.66, 8.88, 9.99 };
        int numofFruits = fruits.length, numofNumbers = numbers.length, numofPrices = prices.length;

        System.out.println("Fruits: ");

        for(int i = 0; i < numofFruits; i++) {
            System.out.printf("%s ", fruits[i]);
        }

        System.out.print("\n\nFruits: \n");
        // Arrays.sort(fruits); // Sort in ASC order
        // Arrays.sort(fruits, Collections.reverseOrder()); // Sort in DESC order
        // Arrays.fill(fruits, "Pineapple"); // Replace all fruits with "Pineapple"
        // Arrays.fill(fruits, 1, 3, "Oranges"); // Replace Index 1 and 2 to "Oranges"
        fruits[0] = "Pineapple"; // Replace Index 0 as "Pineapple"

        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nNumbers: ");

        for(int i = 0; i < numofNumbers; i++) {
            System.out.printf("%d ", numbers[i]);
        }

        System.out.println("\n\nPrices: ");

        for(int i = 0; i < numofPrices; i++) {
            System.out.printf("%.2f ", prices[i]);
        }
    }
}