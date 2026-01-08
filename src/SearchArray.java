import java.util.Scanner;

public class SearchArray {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"Apple", "Orange", "Banana"};
        String target;
        //int target = 7;
        boolean isFound = false; // Element is found or not found

        System.out.print("Enter a fruit to be searched for: ");
        target = scanner.nextLine();

        for(int i=0; i < fruits.length; i++) {
            String currentFruit = fruits[i].toLowerCase();

            //target == fruits[i] numerical variables
            if(currentFruit.equals(target.toLowerCase())) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound) {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
