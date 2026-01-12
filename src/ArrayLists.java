import java.util.ArrayList;

public class ArrayLists {
    public static void show() {

        ArrayList<Fruits> fruitsList = new ArrayList<>();

        fruitsList.add(new Fruits("Apple", 2.50));
        fruitsList.add(new Fruits("Banana", 1.20));
        fruitsList.add(new Fruits("Orange", 1.80));

        for (Fruits fruit : fruitsList) {
            System.out.println(fruit.name + " - $" + fruit.price);
        }
    }
}
