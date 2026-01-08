import org.w3c.dom.css.Rect;

public class Abstraction {
    public static void show() {
        //Abstract => Used to define abstract class and methods
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        circle.display();

        //Print out the area of each shape
        System.out.printf("Circle Area: %.2f cm\n", circle.area());
        System.out.printf("Triangle Area: %.2f cm\n", triangle.area());
        System.out.printf("Rectangle Area: %.2f cm\n", rectangle.area());
    }
}
