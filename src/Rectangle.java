public class Rectangle extends Shape {
    double length, width;

    Rectangle(double a, double b) {
        this.length = a;
        this.width = b;
    }

    @Override
    double area() {
        return length * width;
    }
}
