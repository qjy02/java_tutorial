public class Triangle extends Shape {
    double base, height;

    Triangle(double a, double b) {
        this.base = a;
        this.height = b;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}
