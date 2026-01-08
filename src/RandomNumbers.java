import java.util.Random;

public class RandomNumbers {
    public static void show() {
        Random random = new Random();
        int number;
        int number2;
        int number3;
        int number4;
        int x = 100;
        int y = 5000;
        double price;
        char currency = '$';
        boolean isHeads;

        number = random.nextInt(100); // 0 <= number < 100
        number2 = 1 + random.nextInt(100); // 1 <= number2 <= 100
        number3 = random.nextInt(1, 100); // 1 <= number3 < 100
        number4 = random.nextInt(x, y); // x <= number4 < y
        price = random.nextDouble() * 100; // 0.0 <= price < 100.0
        isHeads = random.nextBoolean();

        System.out.println("Number 0-100: " + number);
        System.out.println("Number 1-100: " + number2);
        System.out.println("Number 1-100: " + number3);
        System.out.println("Number 4: " + number4);
        System.out.printf("The price is: %s%.2f\n", currency, price);

        if(isHeads) {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }
    }
}
