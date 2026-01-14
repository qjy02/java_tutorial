import java.util.ArrayList;

public class Generics {
    public static void show() {
        // String
        Box<String, Double> box1 = new Box<>("Donut", 3.00);
        Box<String, Integer> box2 = new Box<>("Bingxue Jasmine Milk Tea", 5);

        // Integer
        //Box<Integer> box = new Box<>();
        //box.setItem(1);

        // Double
        //Box<Double> box = new Box<>();
        //box.setItem(2.5);

        // Boolean
        //Box<Boolean> box = new Box<>();
        //box.setItem(true);

        System.out.println(box1.getItem());
        System.out.printf("$ %.2f\n", box1.getPrice());

        System.out.println();

        System.out.println(box2.getItem());
        System.out.printf("$ %d\n", box2.getPrice());
    }
}
