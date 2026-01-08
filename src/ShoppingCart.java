import java.util.Scanner;

public class ShoppingCart {
    public static void show() {
        //SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each item?: " + currency);
        price = scanner.nextDouble();

        System.out.print("What is the quantity?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nItem: " + item);
        System.out.printf("Price: %s%.2f\n", currency, price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Price: %s%.2f\n", currency, total);

        scanner.close();
    }
}
