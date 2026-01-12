import java.util.Scanner;

public class RuntimePolymorphism {
    public static void show() {
        Scanner scanner = new Scanner(System.in);

         Product product;

        System.out.print("Would you like a manga or a magazine? (1 = manga, 2 = magazine): ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            product = new Manga();
            product.choose();
        }
        else if(choice == 2) {
            product = new Magazine();
            product.choose();
        }

         scanner.close();
    }
}
